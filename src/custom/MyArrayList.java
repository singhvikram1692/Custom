package custom;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<T>{
    // creates new list(with specified type else with object type) with no args and default size 10, and with int arg to get initial size
    // underlying ds array
    //initial size 10
    // gets double after getting full, copies previous array elements to new one
    // adds element to the list, returns void i.e. add method
    //allows duplicate elements
    //gets element using index
    //removes elements using index
    //add element at index, shifts all elements from that position to right
    //return true/false if object exists, contains method
    // sets element at specified index
    // returns number of elements present, i.e. size

    private int capacity = 10;
    private int size = 0;
    private Object[] elements;

    public MyArrayList(int capacity){
        this.capacity = capacity;
        elements = new Object[capacity];
    }

    public MyArrayList(){
        elements = new Object[10];
    }



    public void add(T element){
        if (size >= capacity - 1) {
            createBiggerArrayAndCopyElements();
        }
        elements[size] = element;
        size++;
    }

    private void createBiggerArrayAndCopyElements(){
        Object[] temp = elements;
        elements  = new Object[capacity*2];
        for(int i=0; i<temp.length;i++){
            elements[i] = temp[i];
        }
        capacity = capacity*2;
    }

    public int size(){
        return size;
    }

    public T get(int index){
        return (T)elements[index];
    }

    public int contains(T element){
        int i = 0;
        while(i<size){
         if(elements[i] == element) return i;
         i++;
        }
        return -1;
    }

    public Object remove(int index){
        Object el = elements[index];
        shiftElementsToLeft(index);
        return el;
    }

    private void shiftElementsToLeft(int index){
        for(int i = index;i<size-1;i++){
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
    }

    public void add(int index,T element){
        if(size == capacity) createBiggerArrayAndCopyElements();
        shiftElementsToRight(index);
        elements[index] = element;
        size++;
    }

    private void shiftElementsToRight(int index){
        for(int i = size; i>index;i--){
            elements[i] = elements[i-1];
        }
    }

    public Object set(int index, T element){
        Object el = elements[index];
        elements[index] = element;
        return el;

    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(int i =0;i<size;i++){
            sb.append(elements[i]);
            if(i != size-1){
                sb.append(" , ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(4);
        myArrayList.add(1);
        myArrayList.add(10);
        myArrayList.add(100);
        myArrayList.add(1000);
        myArrayList.add(10000);
        myArrayList.add(100000);
        myArrayList.add(0,2);
        myArrayList.add(0,1);
        myArrayList.set(2, 3);
        myArrayList.remove(7);
        myArrayList.remove(6);
        myArrayList.remove(5);
        System.out.println(myArrayList);
        System.out.println(myArrayList.contains(30));
    }
}
