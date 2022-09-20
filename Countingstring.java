package com.example.springAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

@Component
public class Countingstring {
    public void express3(String name1,String name2){

    ExpressionParser parser = new SpelExpressionParser();
    StandardEvaluationContext expression = new StandardEvaluationContext();
        expression.setVariable("name1",name1);
        expression.setVariable("name2",name2);

    Expression e2 =parser.parseExpression("#name1.bytes.length");
    int s2 = (Integer) e2.getValue(expression);

    Expression e3 =parser.parseExpression("#name2.bytes.length");
    int s3 = (Integer) e3.getValue(expression);
    System.out.println("Length of Both Strings");
    System.out.println(s2+s3);


}


}
