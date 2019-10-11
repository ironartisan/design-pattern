package factory.method;

import factory.simple.Operation;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 10:23.
 * factory method
 * the core of the pattern
 */
public interface iFactory {
    Operation createOperation();
}
