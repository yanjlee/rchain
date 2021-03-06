package rholang.parsing.lambda.Absyn; // Java Package generated by the BNF Converter.

public class ESecond extends Expr {
  public final TypedExpr typedexpr_;
  public ESecond(TypedExpr p1) { typedexpr_ = p1; }

  public <R,A> R accept(rholang.parsing.lambda.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.lambda.Absyn.ESecond) {
      rholang.parsing.lambda.Absyn.ESecond x = (rholang.parsing.lambda.Absyn.ESecond)o;
      return this.typedexpr_.equals(x.typedexpr_);
    }
    return false;
  }

  public int hashCode() {
    return this.typedexpr_.hashCode();
  }


}
