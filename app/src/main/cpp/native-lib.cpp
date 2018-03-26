#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring

JNICALL
Java_tw_com_cct_ms2_shrink_1tc_1app_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
