package de.telran.home20240201.calculator;

public class ByteOperations implements Calculator<Byte>{
        @Override
        public Byte add(Byte firstArgument, Byte secondArgument){
            return (byte) (firstArgument + secondArgument);
        }
        @Override
        public Byte sub(Byte firstArgument, Byte secondArgument){
            return (byte) (firstArgument - secondArgument);
        }
        @Override
        public Byte multiply(Byte firstArgument, Byte secondArgument){
            return (byte) (firstArgument * secondArgument);
        }
        @Override
        public Byte divide(Byte firstArgument, Byte secondArgument){
            return (byte) (firstArgument / secondArgument);
        }
}
