#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

#define BUFFER_SIZE 256

int main() 
{
    int pipefd[2];
    pid_t pid;
    char buffer[BUFFER_SIZE];
    int status;

    if (pipe(pipefd) == -1) 
    {
        perror("pipe");
        exit(EXIT_FAILURE);
    }


    pid = fork();
    
    if (pid < 0) 
    {
        perror("fork");
        exit(EXIT_FAILURE);
    } 
    else if (pid > 0) 
    {
        close(pipefd[0]);
        printf("Parent process writing data to the pipe...\n");
        char message[] = "\nHello, child process!";
        
        write(pipefd[1], message, sizeof(message));

        close(pipefd[1]);

        wait(&status);
    }
    else 
    {
        close(pipefd[1]);
        printf("Child process reading data from the pipe...\n\n");
        ssize_t bytesRead = read(pipefd[0], buffer, sizeof(buffer));
        printf("Data received from parent process: %.*s\n", (int)bytesRead, buffer);
        close(pipefd[0]);
        exit(EXIT_SUCCESS);
    }
    return 0;
}