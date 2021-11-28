package com.pb.timoshenko.hw10;

public class NumBox <T extends Number>{
    private T[] nums;

   public NumBox (int size){
        nums = (T[]) new Number[size];
    }

    public T get (int index){
        return nums[index];
    }

    public void setNum (int index, T nums){
        this.nums[index] = nums;
    }

    public int length(){
        int count = 0;
        for(T i : nums){
            if(!(i == null)){
                count++;
            } else count+=0;
        }
        return count;
    }

//    ///////////////////////////////////////////////////////////
//    void add(T t) throws Exception {
//        if(this.filled >= this.num.length){
//            throw new Exception("Array already filled!");
//        }
//        this.num[this.filled] = t;
//        this.filled++;
//    }
//
//    public double sum() {
//        double sum = 0.0;
//        for(T i : num){
//            if(i == null){
//                sum+=0;
//            } else sum+=i.doubleValue();
//        }
//        return sum;
//    }
//
//    public double average(){
//        double avеrage = (sum()/length());
//        return avеrage;
//    }
//
    public T max(){
        T max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
