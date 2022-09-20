package com.example.springAssignment;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

@Component
public class Message {

    public void express(String name){

        ExpressionParser parser = new SpelExpressionParser();
        StandardEvaluationContext expression = new StandardEvaluationContext();
        expression.setVariable("name",name);
        Expression expression1 =parser.parseExpression("#name.toUpperCase");
        String string = (String) expression1.getValue(expression);
        System.out.println("String in Uppercase : "+string);

        Expression expression2 =parser.parseExpression("#name.bytes.length");
        int string_length = (Integer) expression2.getValue(expression);
        System.out.println("UpperCase String Length :"+string_length);
    }

}
