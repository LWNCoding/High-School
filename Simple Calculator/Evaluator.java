class Evaluator{
  private ExpressionTokenizer tokenizer;

  public Evaluator(String anExpression){
    tokenizer = new ExpressionTokenizer(anExpression);
  }
  /**
    Evaluates the expression.
    @return the value of the expression.
  */
  public int getExpressionValue(){
    int a1 = getTermValue();
    if(tokenizer.peekToken() == null){
      return a1;
    } 
    if(tokenizer.peekToken().equals("+")){
      tokenizer.nextToken();
      return a1 + getExpressionValue();
    }
    if(tokenizer.peekToken().equals("-")){
      tokenizer.nextToken();
      return a1 - getExpressionValue();
    }
    return a1;
  }

/**
Evaluates the next term found in the expression.
@return the value of the term
*/
 public int getTermValue()
{
  int a1 = getFactorValue();
  if(tokenizer.peekToken() ==  null){
    return a1;
  }
  if(tokenizer.peekToken().equals("*")){
    tokenizer.nextToken();
    return a1 * getTermValue();
  }
  if(tokenizer.peekToken().equals("/")){
    tokenizer.nextToken();
    return a1 / getTermValue();
  }
  return a1;
}

  /**
  Evaluates the next factor found in the expression.
  @return the value of the factor
  */
  public int getFactorValue(){
    int value;
    String next = tokenizer.peekToken();
    if ("(".equals(next)){
      tokenizer.nextToken(); // Discard "("
      value = getExpressionValue();
      tokenizer.nextToken(); // Discard ")"
     }
     else
     {
        value = Integer.parseInt(tokenizer.nextToken());
     }
     return value;
  }
}