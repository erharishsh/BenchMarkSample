package com.vyng.core

fun linearSearch(arr:IntArray,key:Int):Boolean{
    arr.forEach {
        if(it==key)
            return true;
    }
    return false
}


fun binarySearch(arr:IntArray,key:Int):Boolean{

    var l =0
    var h = arr.size-1

    var mid =0

    while(l<=h){
        mid= (l+h)/2;

        if(arr[mid]==key)
            return true
        if(arr[mid]<key){
            l = mid+1
        }else{
            h= mid -1
        }
    }
    return false
}
