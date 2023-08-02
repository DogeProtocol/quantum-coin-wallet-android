/* Code generated by cmd/cgo; DO NOT EDIT. */

/* package command-line-arguments */


#line 1 "cgo-builtin-export-prolog"

#include <stddef.h>

#ifndef GO_CGO_EXPORT_PROLOGUE_H
#define GO_CGO_EXPORT_PROLOGUE_H

#ifndef GO_CGO_GOSTRING_TYPEDEF
typedef struct { const char *p; ptrdiff_t n; } _GoString_;
#endif

#endif

/* Start of preamble from import "C" comments.  */




/* End of preamble from import "C" comments.  */


/* Start of boilerplate cgo prologue.  */
#line 1 "cgo-gcc-export-header-prolog"

#ifndef GO_CGO_PROLOGUE_H
#define GO_CGO_PROLOGUE_H

typedef signed char GoInt8;
typedef unsigned char GoUint8;
typedef short GoInt16;
typedef unsigned short GoUint16;
typedef int GoInt32;
typedef unsigned int GoUint32;
typedef long long GoInt64;
typedef unsigned long long GoUint64;
typedef GoInt64 GoInt;
typedef GoUint64 GoUint;
typedef size_t GoUintptr;
typedef float GoFloat32;
typedef double GoFloat64;
#ifdef _MSC_VER
#include <complex.h>
typedef _Fcomplex GoComplex64;
typedef _Dcomplex GoComplex128;
#else
typedef float _Complex GoComplex64;
typedef double _Complex GoComplex128;
#endif

/*
  static assertion to make sure the file is being used on architecture
  at least with matching size of GoInt.
*/
typedef char _check_for_64_bit_pointer_matching_GoInt[sizeof(void*)==64/8 ? 1:-1];

#ifndef GO_CGO_GOSTRING_TYPEDEF
typedef _GoString_ GoString;
#endif
typedef void *GoMap;
typedef void *GoChan;
typedef struct { void *t; void *v; } GoInterface;
typedef struct { void *data; GoInt len; GoInt cap; } GoSlice;

#endif

/* End of boilerplate cgo prologue.  */

#ifdef __cplusplus
extern "C" {
#endif


/* Return type for PublicKeyToAddress */
struct PublicKeyToAddress_return {
	char* r0;
	char* r1;
};
extern struct PublicKeyToAddress_return PublicKeyToAddress(char* pKey_str, GoInt pk_count);

/* Return type for TxMessage */
struct TxMessage_return {
	char* r0;
	char* r1;
};
extern struct TxMessage_return TxMessage(char* from, char* nonce, char* to, char* value, char* gasLimit, char* gasPrice, char* data, char* chainId);

/* Return type for TxHash */
struct TxHash_return {
	char* r0;
	char* r1;
};
extern struct TxHash_return TxHash(char* from, char* nonce, char* to, char* value, char* gasLimit, char* gasPrice, char* data, char* chainId, char* pKey_str, char* sig_str, GoInt pk_count, GoInt sig_count);

/* Return type for TxData */
struct TxData_return {
	char* r0;
	char* r1;
};
extern struct TxData_return TxData(char* from, char* nonce, char* to, char* value, char* gasLimit, char* gasPrice, char* data, char* chainId, char* pKey_str, char* sig_str, GoInt pk_count, GoInt sig_count);

/* Return type for DogeProtocolToWei */
struct DogeProtocolToWei_return {
	char* r0;
	char* r1;
};
extern struct DogeProtocolToWei_return DogeProtocolToWei(char* quantity);

/* Return type for ParseBigFloat */
struct ParseBigFloat_return {
	char* r0;
	char* r1;
};
extern struct ParseBigFloat_return ParseBigFloat(char* quantity);

/* Return type for WeiToDogeProtocol */
struct WeiToDogeProtocol_return {
	char* r0;
	char* r1;
};
extern struct WeiToDogeProtocol_return WeiToDogeProtocol(char* quantity);

#ifdef __cplusplus
}
#endif
