//FCFS
#include <stdio.h>

struct Process 
{
    int processId;
    int arrivalTime;
    int burstTime;
    int completionTime;
    int waitingTime;
    int turnaroundTime;
};

void calculateTimes(struct Process processes[], int n) {
    int currentTime = 0;
    int totalWaitingTime = 0;
    int totalTurnaroundTime = 0;
    
    for (int i = 0; i < n; i++) {
        if (currentTime < processes[i].arrivalTime) 
        {
            currentTime = processes[i].arrivalTime;
        }
        
        processes[i].completionTime = currentTime + processes[i].burstTime;
        processes[i].turnaroundTime = processes[i].completionTime - processes[i].arrivalTime;
        processes[i].waitingTime = processes[i].turnaroundTime - processes[i].burstTime;
        
        currentTime = processes[i].completionTime;
        totalWaitingTime += processes[i].waitingTime;
        totalTurnaroundTime += processes[i].turnaroundTime;
    }
    
    double averageWaitingTime = (double) totalWaitingTime / n;
    double averageTurnaroundTime = (double) totalTurnaroundTime / n;
    
    printf("\nProcess\tArrival Time\tBurst Time\tCompletion Time\tWaiting Time\tTurnaround Time\n");
    
    for (int i = 0; i < n; i++) {
        printf("\t%d\t\t%d\t\t\t\t%d\t\t\t%d\t\t\t\t%d\t\t\t\t%d\n", processes[i].processId, processes[i].arrivalTime,
               processes[i].burstTime, processes[i].completionTime, processes[i].waitingTime, processes[i].turnaroundTime);
    }
    
    printf("\nAverage Waiting Time: %.2lf", averageWaitingTime);
    printf("\nAverage Turnaround Time: %.2lf", averageTurnaroundTime);
}

int main()
{
    int n;
    printf("Enter the number of processes: ");
    scanf("%d", &n);
    
    struct Process processes[n];
    
    printf("\nEnter the arrival time and burst time for each process:\n");
    
    for (int i = 0; i < n; i++) {
        printf("\nProcess %d\n", i+1);
        processes[i].processId = i + 1;
        
        printf("Arrival Time: ");
        scanf("%d", &processes[i].arrivalTime);
        
        printf("Burst Time: ");
        scanf("%d", &processes[i].burstTime);
    }
    
    calculateTimes(processes, n);
    
}
