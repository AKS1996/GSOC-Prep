#include <jni.h>
#include <iostream>
#include <cstring>
#include <sstream>
#include "VpImageUChar.h"  // This include is native header file for current source file
#include <visp3/core/vpImage.h>
typedef unsigned char u_char;


// Java Method:    VpImageUChar()
JNIEXPORT jlong JNICALL Java_org_visp_core_VpImageUChar_n_1VpImageUChar__
  (JNIEnv *env, jclass, jstring type){
	return (jlong) new vpImage<u_char>();
}


// Java Method:    VpImageUChar(int r, int c)
JNIEXPORT jlong JNICALL Java_org_visp_core_VpImageUChar_n_1VpImageUChar__II
  (JNIEnv *env, jclass, jint r, jint c){
	return (jlong) new vpImage<u_char>(r,c);
}

// Java Method:    VpImageUChar(int r, int c, byte val)
JNIEXPORT jlong JNICALL Java_org_visp_core_VpImageUChar_n_1VpImageUChar__IIB
  (JNIEnv *env, jclass, jint r, jint c, jbyte value){
	return (jlong) new vpImage<u_char>(r,c, (u_char) value);
}

// Java Method:    VpImageUChar(byte[] array, int height, int width, boolean copyData)
JNIEXPORT jlong JNICALL Java_org_visp_core_VpImageUChar_n_1VpImageUChar___3BIIZ
  (JNIEnv *env, jclass, jbyteArray arr, jint h, jint w, jboolean copyData){
	jbyte *array = env->GetByteArrayElements(arr, NULL);
	
	return (jlong) new vpImage<u_char>((u_char *const) array, (const unsigned int) h, (const unsigned int) w, copyData);
	
	// be memory friendly
	env->ReleaseByteArrayElements(arr, array, 0);
}

// Java Method:    getCols()
JNIEXPORT jint JNICALL Java_org_visp_core_VpImageUChar_n_1cols
  (JNIEnv *env, jclass, jlong address){
	vpImage<u_char>* me = (vpImage<u_char>*) address; //TODO: check for NULL
	return me->getCols();
}

// Java Method:    getRows()
JNIEXPORT jint JNICALL Java_org_visp_core_VpImageUChar_n_1rows
  (JNIEnv *env, jclass, jlong address){
	vpImage<u_char>* me = (vpImage<u_char>*) address; //TODO: check for NULL
	return me->getRows();
}

// Java Method:    dump()
JNIEXPORT jstring JNICALL Java_org_visp_core_VpImageUChar_n_1dump
  (JNIEnv *env, jclass, jlong address){
	vpImage<u_char>* me = (vpImage<u_char>*) address; //TODO: check for NULL
	std::stringstream ss;
	ss << *me;
	return env->NewStringUTF(ss.str().c_str());
}
