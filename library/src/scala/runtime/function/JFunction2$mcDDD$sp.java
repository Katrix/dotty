
/*
 * Copyright (C) 2012-2014 Typesafe Inc. <http://www.typesafe.com>
 */

package scala.runtime.function;

@FunctionalInterface
public interface JFunction2$mcDDD$sp extends JFunction2<Object, Object, Object> {
    abstract double apply$mcDDD$sp(double v1, double v2);

    default Object apply(Object v1, Object v2) { return (Double) apply$mcDDD$sp(scala.runtime.BoxesRunTime.unboxToDouble(v1), scala.runtime.BoxesRunTime.unboxToDouble(v2)); }
}
