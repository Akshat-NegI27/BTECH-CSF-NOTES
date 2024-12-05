{
static class Date
int d, m, y;
public Date(int d, int m, int y)
this.d=d;
this.m = m;
this.y = Y;
};
static int monthDays{] = (31, 28, 31, 30, 31, 30, 31, 31, 30, 31,
30, 31};
static int countLeapYears(Date d)
int years = d.y;
if (d.m <= 2)
years--;
return years / 4- years / 100 + years / 400;
static int getDifference(Date dt1, Date dt2)
int n1 = dt1.y * 365 + dt1.d;
for (inti=0;i< dt1.m - 1; i++)
n1 += monthDayslil;
n1 += countLeapYears(dt1);
int n2 = dt2.v * 365 + dt2.d;
for (inti = 0; i <dt2.m - 1; i++)
n2 += monthDays[il;
n2 += countLeapYears(dt2);
return (n2 - n1);