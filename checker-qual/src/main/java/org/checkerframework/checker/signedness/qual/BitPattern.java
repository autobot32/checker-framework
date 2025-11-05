package org.checkerframework.checker.signedness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

/**
 * Values that should be treated purely as patterns of bits rather than as arithmetic quantities.
 *
 * <p>Examples include the result of {@link Double#doubleToLongBits(double)} or bitset-like values
 * that are only manipulated with bitwise operators.
 *
 * @checker_framework.manual #signedness-checker Signedness Checker
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@SubtypeOf(UnknownSignedness.class)
public @interface BitPattern {}
