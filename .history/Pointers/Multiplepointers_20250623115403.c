#include <stdio.h>

int main() {
    int a =10;
    int *p1=&a;
    int **p2=&p1;
    int ***p3 = &p2;
    int ****p4 = &p3;
    printf("Address of %p\n",p1);
    printf("Address of %p\n",p2);
    printf("Address of %p\n",p3);
    printf("Address of %p\n",p4);
    printf("Address of %p\n",&p2);
    printf("Address of %p\n",**p3);
    return 0;
}