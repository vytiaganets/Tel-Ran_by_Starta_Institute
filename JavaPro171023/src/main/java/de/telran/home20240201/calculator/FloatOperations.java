package de.telran.home20240201.calculator;

public class FloatOperations implements Calculator<Float> {
    @Override
    public Float add(Float firstArgument, Float secondArgument){
        return firstArgument + secondArgument;
    }
    @Override
    public Float sub(Float firstArgument, Float secondArgument){
        return firstArgument - secondArgument;
    }
    @Override
    public Float multiply(Float firstArgument, Float secondArgument){
        return firstArgument * secondArgument;
    }
    @Override
    public Float divide(Float firstArgument, Float secondArgument){
        return firstArgument / secondArgument;
    }
}
