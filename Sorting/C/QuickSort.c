#include<stdio.h> 

void swap(int* x, int* y) 
{ 
    int temp = *x; 
    *x = *y; 
    *y = temp; 
}

int partition (int array[], int low, int high) 
{ 
    int pivot = array[high];
    int i = (low - 1);
  
    for (int j = low; j <= high - 1; j++) 
    { 
        if (array[j] < pivot) 
        { 
            swap(&array[++i], &array[j]); 
        } 
    }

    i++;
    swap(&array[i], &array[high]); 
    
    return i; 
} 
  

void quickSort(int array[], int low, int high) 
{ 
    if (low < high) 
    { 
        int part = partition(array, low, high); 
        quickSort(array, low, part - 1); 
        quickSort(array, part + 1, high); 
    } 
} 
  
int main() 
{ 
    int array[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    int length = sizeof(array) / sizeof(array[0]); 
    quickSort(array, 0, length - 1); 
    
    for (int i = 0; i < length; i++) {
        printf("%d: %d\n", (i + 1), array[i]); 
    } 

    return 0; 
} 