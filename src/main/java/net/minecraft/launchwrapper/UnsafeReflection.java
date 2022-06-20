package net.minecraft.launchwrapper;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class UnsafeReflection {

  private static final Unsafe theUnsafe;

  static {
    try {
      Field theUnsafeField = Unsafe.class.getDeclaredField("theUnsafe");
      theUnsafeField.setAccessible(true);
      theUnsafe = (Unsafe) theUnsafeField.get(null);
    } catch(NoSuchFieldException e) {
      throw new AssertionError("could not access unsafe!?");
    } catch(IllegalAccessException e) {
      throw new AssertionError("could not access unsafe!?");
    }
  }

  @SuppressWarnings("unchecked")
  public static <T> T getDeclaredObjectValue(Class<?> clazz, String fieldName, Object instance) throws NoSuchFieldException {
    return (T) theUnsafe.getObject(instance, theUnsafe.objectFieldOffset(clazz.getDeclaredField(fieldName)));
  }

  public static void setDeclaredObjectValue(Class<?> clazz, String fieldName, Object instance, Object setTo) throws NoSuchFieldException {
    theUnsafe.getAndSetObject(instance, theUnsafe.objectFieldOffset(clazz.getDeclaredField(fieldName)), setTo);
  }
}
