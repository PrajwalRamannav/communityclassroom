package com.prajwal;
// What is package?
// Package is just folder where your java file lies, which means
// -> You only can access these files(Classes, functions etx)
// -> Everything in this package is bound to set of rules created by the package itself
// -> Package is just maintain privacy <---------->

public class Main {
    // class -> class is collection group of properties and functions.
    // Public -> It is a class where everyone(Functions, objects, packages) can access this class
    // Convention -> Always use 1ST letter of class name as capital while creating class
    public static void main(String[] args){
        // public - This is public function because ot is the 1st function where program starts, and it should be public to access it
        // Convention -> Always use small case for function name while creating function

        // static -> Whenever we need to run our function without object we use static - because first function will not have objects
        // void - Return null --> void is data type which returns null

        System.out.println("Hello World!");
        // System -> System is a in-built class used whenever you want to print something
        // out -> it is a reference variable & it is print stream
        // println -> it is a object of reference variable "out" which is used to output something
        // ; -> is used to end statement || line
    }
}