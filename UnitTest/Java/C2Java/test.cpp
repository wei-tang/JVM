#include <iostream>
#include <jni.h>


int main() { 
  JavaVMOption options[2];
  JNIEnv *env;
  JavaVM *jvm;
  JavaVMInitArgs vm_args;
  long status;
  jclass cls;
  jmethodID mid;
  jint square;
  jboolean nt;
  jobject jobj;
  
  options[0].optionString = "-Djava.class.path = ./";
  options[1].optionString = "-verbose:jni";
  vm_args.version = JNI_VERSION_1_6;
  vm_args.nOptions = 1;
  vm_args.options = options;
  vm_args.ignoreUnrecognized = JNI_TRUE;
  for(int i = 0; i < 1; i++) { 
    status = JNI_CreateJavaVM(&jvm, (void**)&env, &vm_args);
    jvm->DestroyJavaVM();
  }

  return 0;
}
