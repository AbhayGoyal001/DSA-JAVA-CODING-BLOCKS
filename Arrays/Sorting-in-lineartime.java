The solution to this algorithm will require 3 pointers to iterate throughout the array, swapping the necessary elements.

(1) Create a low pointer at the beginning of the array and a high pointer at the end of the array.
(2) Create a mid pointer that starts at the beginning of the array and iterates through each element.
(3) If the element at arr[mid] is a 2, then swap arr[mid] and arr[high] and decrease the high pointer by 1.
(4) If the element at arr[mid] is a 0, then swap arr[mid] and arr[low] and increase the low and mid pointers by 1.
(5) If the element at arr[mid] is a 1, don't swap anything and just increase the mid pointer by 1.


void swap(int *a, int *b) 
{ 
    int temp = *a; 
    *a = *b; 
    *b = temp; 
} 
void sort012(int a[], int arr_size) 
{ 
    int lo = 0; 
    int hi = arr_size - 1; 
    int mid = 0; 

    while (mid <= hi) 
    { 
        switch (a[mid]) 
        { 
        case 0: 
            swap(&a[lo++], &a[mid++]); 
            break; 
        case 1: 
            mid++; 
            break; 
        case 2: 
            swap(&a[mid], &a[hi--]); 
            break; 
        } 
    } 
} 
Lang - Java

 static void sort012(int a[], int arr_size) 
    { 
        int lo = 0; 
        int hi = arr_size - 1; 
        int mid = 0,temp=0; 
        while (mid <= hi) 
        { 
            switch (a[mid]) 
            { 
            case 0: 
            { 
                temp   =  a[lo]; 
                a[lo]  = a[mid]; 
                a[mid] = temp; 
                lo++; 
                mid++; 
                break; 
            } 
            case 1: 
                mid++; 
                break; 
            case 2: 
            { 
                temp = a[mid]; 
                a[mid] = a[hi]; 
                a[hi] = temp; 
                hi--; 
                break; 
            } 
            } 
        } 
    } 
