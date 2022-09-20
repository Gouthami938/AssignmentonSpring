package com.example.springAssignment;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

@Component
public class Message2 {

    public void express1(String name1) {
        ExpressionParser parser = new SpelExpressionParser();
        StandardEvaluationContext expression = new StandardEvaluationContext();
        expression.setVariable("name1",name1);
        Expression expression1 =parser.parseExpression("#name1.toLowerCase");
        String string = (String) expression1.getValue(expression);
        System.out.println("String in Lowercase :"+string);


        Expression expression2 =parser.parseExpression("#name1.bytes.length");
        int string_length = (Integer) expression2.getValue(expression);
        System.out.println("LowerCase String Length :"+string_length);
    }

    }
