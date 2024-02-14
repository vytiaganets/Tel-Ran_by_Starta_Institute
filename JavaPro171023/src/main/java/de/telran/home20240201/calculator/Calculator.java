package de.telran.home20240201.calculator;

public interface Calculator<Template extends Number> {
    Template add(Template firstArgument, Template secondArgument);
    Template sub(Template firstArgument, Template secondArgument);
    Template multiply(Template firstArgument, Template secondArgument);
    Template divide(Template firstArgument, Template secondArgument);

}
