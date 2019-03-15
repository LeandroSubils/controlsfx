package org.controlsfx.control.table;

@java.lang.FunctionalInterface
public abstract interface TriPredicate<T, U, V> {  
  
  public abstract boolean test(T arg0, U arg1, V arg2);

}