//
// This file is auto-generated. Please don't modify it!
//
package org.visp.core;

import java.lang.String;
import org.visp.core.VpColVector;
import org.visp.core.VpHomogeneousMatrix;
import org.visp.core.VpMatrix;
import org.visp.core.VpRowVector;

// C++: class VpMatrix
//javadoc: VpMatrix

public class VpMatrix {

    public final long nativeObj;
    public VpMatrix(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static VpMatrix __fromPtr__(long addr) { return new VpMatrix(addr); }

    //
    // C++:   vpMatrix(int r, int c, double val)
    //

    //javadoc: VpMatrix::VpMatrix(r, c, val)

    public   VpMatrix(int r, int c, double val)
    {
        
        nativeObj = VpMatrix_0(r, c, val);
        
        return;
    }
                
    //
    // C++:   vpMatrix(int r, int c)
    //

    //javadoc: VpMatrix::VpMatrix(r, c)

    public   VpMatrix(int r, int c)
    {
        
        nativeObj = VpMatrix_1(r, c);
        
        return;
    }
                
    //
    // C++:   vpMatrix(vpArray2D_double A)
    //

    // Unknown type 'vpArray2D_double' (I), skipping the function


    //
    // C++:   vpMatrix(vpMatrix A)
    //

    //javadoc: VpMatrix::VpMatrix(A)

    public   VpMatrix(VpMatrix A)
    {
        
        nativeObj = VpMatrix_2(A.nativeObj);
        
        return;
    }
                
    //
    // C++:   vpMatrix(vpMatrix M, int r, int c, int nrows, int ncols)
    //

    //javadoc: VpMatrix::VpMatrix(M, r, c, nrows, ncols)

    public   VpMatrix(VpMatrix M, int r, int c, int nrows, int ncols)
    {
        
        nativeObj = VpMatrix_3(M.nativeObj, r, c, nrows, ncols);
        
        return;
    }
                
    //
    // C++:   vpMatrix()
    //

    //javadoc: VpMatrix::VpMatrix()

    public   VpMatrix()
    {
        
        nativeObj = VpMatrix_4();
        
        return;
    }
                
    //
    // C++:  bool loadMatrix(string filename, vpArray2D_double M, bool binary = false, c_string header = 0)
    //

    // Unknown type 'vpArray2D_double' (I), skipping the function


    //
    // C++:  bool loadMatrixYAML(string filename, vpArray2D_double M, c_string header = 0)
    //

    // Unknown type 'vpArray2D_double' (I), skipping the function


    //
    // C++:  bool saveMatrix(string filename, vpArray2D_double M, bool binary = false, c_string header = "")
    //

    // Unknown type 'vpArray2D_double' (I), skipping the function


    //
    // C++:  bool saveMatrixYAML(string filename, vpArray2D_double M, c_string header = "")
    //

    // Unknown type 'vpArray2D_double' (I), skipping the function


    //
    // C++:  double cond()
    //

    //javadoc: VpMatrix::cond()

    public  double cond()
    {
        
        double retVal = cond_0(nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  double detByLU()
    //

    //javadoc: VpMatrix::detByLU()

    public  double detByLU()
    {
        
        double retVal = detByLU_0(nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  double detByLUEigen3()
    //

    //javadoc: VpMatrix::detByLUEigen3()

    public  double detByLUEigen3()
    {
        
        double retVal = detByLUEigen3_0(nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  double detByLUGsl()
    //

    //javadoc: VpMatrix::detByLUGsl()

    public  double detByLUGsl()
    {
        
        double retVal = detByLUGsl_0(nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  double detByLULapack()
    //

    //javadoc: VpMatrix::detByLULapack()

    public  double detByLULapack()
    {
        
        double retVal = detByLULapack_0(nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  double detByLUOpenCV()
    //

    //javadoc: VpMatrix::detByLUOpenCV()

    public  double detByLUOpenCV()
    {
        
        double retVal = detByLUOpenCV_0(nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  double euclideanNorm()
    //

    //javadoc: VpMatrix::euclideanNorm()

    public  double euclideanNorm()
    {
        
        double retVal = euclideanNorm_0(nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  double infinityNorm()
    //

    //javadoc: VpMatrix::infinityNorm()

    public  double infinityNorm()
    {
        
        double retVal = infinityNorm_0(nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  double sum()
    //

    //javadoc: VpMatrix::sum()

    public  double sum()
    {
        
        double retVal = sum_0(nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  double sumSquare()
    //

    //javadoc: VpMatrix::sumSquare()

    public  double sumSquare()
    {
        
        double retVal = sumSquare_0(nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  int kernel(vpMatrix kerAt, double svThreshold = 1e-6)
    //

    //javadoc: VpMatrix::kernel(kerAt, svThreshold)

    public  int kernel(VpMatrix kerAt, double svThreshold)
    {
        
        int retVal = kernel_0(nativeObj, kerAt.nativeObj, svThreshold);
        
        return retVal;
    }
                    //javadoc: VpMatrix::kernel(kerAt)

    public  int kernel(VpMatrix kerAt)
    {
        
        int retVal = kernel_1(nativeObj, kerAt.nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  int print(ostream s, int length, c_string intro = 0)
    //

    // Unknown type 'ostream' (I), skipping the function


    //
    // C++:  int pseudoInverse(vpMatrix Ap, double svThreshold = 1e-6)
    //

    //javadoc: VpMatrix::pseudoInverse(Ap, svThreshold)

    public  int pseudoInverse(VpMatrix Ap, double svThreshold)
    {
        
        int retVal = pseudoInverse_0(nativeObj, Ap.nativeObj, svThreshold);
        
        return retVal;
    }
                    //javadoc: VpMatrix::pseudoInverse(Ap)

    public  int pseudoInverse(VpMatrix Ap)
    {
        
        int retVal = pseudoInverse_1(nativeObj, Ap.nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  int pseudoInverse(vpMatrix Ap, vpColVector sv, double svThreshold, vpMatrix imA, vpMatrix imAt, vpMatrix kerAt)
    //

    //javadoc: VpMatrix::pseudoInverse(Ap, sv, svThreshold, imA, imAt, kerAt)

    public  int pseudoInverse(VpMatrix Ap, VpColVector sv, double svThreshold, VpMatrix imA, VpMatrix imAt, VpMatrix kerAt)
    {
        
        int retVal = pseudoInverse_2(nativeObj, Ap.nativeObj, sv.nativeObj, svThreshold, imA.nativeObj, imAt.nativeObj, kerAt.nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  int pseudoInverse(vpMatrix Ap, vpColVector sv, double svThreshold, vpMatrix imA, vpMatrix imAt)
    //

    //javadoc: VpMatrix::pseudoInverse(Ap, sv, svThreshold, imA, imAt)

    public  int pseudoInverse(VpMatrix Ap, VpColVector sv, double svThreshold, VpMatrix imA, VpMatrix imAt)
    {
        
        int retVal = pseudoInverse_3(nativeObj, Ap.nativeObj, sv.nativeObj, svThreshold, imA.nativeObj, imAt.nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  int pseudoInverse(vpMatrix Ap, vpColVector sv, double svThreshold = 1e-6)
    //

    //javadoc: VpMatrix::pseudoInverse(Ap, sv, svThreshold)

    public  int pseudoInverse(VpMatrix Ap, VpColVector sv, double svThreshold)
    {
        
        int retVal = pseudoInverse_4(nativeObj, Ap.nativeObj, sv.nativeObj, svThreshold);
        
        return retVal;
    }
                    //javadoc: VpMatrix::pseudoInverse(Ap, sv)

    public  int pseudoInverse(VpMatrix Ap, VpColVector sv)
    {
        
        int retVal = pseudoInverse_5(nativeObj, Ap.nativeObj, sv.nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  int pseudoInverseEigen3(vpMatrix Ap, double svThreshold = 1e-6)
    //

    //javadoc: VpMatrix::pseudoInverseEigen3(Ap, svThreshold)

    public  int pseudoInverseEigen3(VpMatrix Ap, double svThreshold)
    {
        
        int retVal = pseudoInverseEigen3_0(nativeObj, Ap.nativeObj, svThreshold);
        
        return retVal;
    }
                    //javadoc: VpMatrix::pseudoInverseEigen3(Ap)

    public  int pseudoInverseEigen3(VpMatrix Ap)
    {
        
        int retVal = pseudoInverseEigen3_1(nativeObj, Ap.nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  int pseudoInverseEigen3(vpMatrix Ap, vpColVector sv, double svThreshold, vpMatrix imA, vpMatrix imAt, vpMatrix kerAt)
    //

    //javadoc: VpMatrix::pseudoInverseEigen3(Ap, sv, svThreshold, imA, imAt, kerAt)

    public  int pseudoInverseEigen3(VpMatrix Ap, VpColVector sv, double svThreshold, VpMatrix imA, VpMatrix imAt, VpMatrix kerAt)
    {
        
        int retVal = pseudoInverseEigen3_2(nativeObj, Ap.nativeObj, sv.nativeObj, svThreshold, imA.nativeObj, imAt.nativeObj, kerAt.nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  int pseudoInverseEigen3(vpMatrix Ap, vpColVector sv, double svThreshold = 1e-6)
    //

    //javadoc: VpMatrix::pseudoInverseEigen3(Ap, sv, svThreshold)

    public  int pseudoInverseEigen3(VpMatrix Ap, VpColVector sv, double svThreshold)
    {
        
        int retVal = pseudoInverseEigen3_3(nativeObj, Ap.nativeObj, sv.nativeObj, svThreshold);
        
        return retVal;
    }
                    //javadoc: VpMatrix::pseudoInverseEigen3(Ap, sv)

    public  int pseudoInverseEigen3(VpMatrix Ap, VpColVector sv)
    {
        
        int retVal = pseudoInverseEigen3_4(nativeObj, Ap.nativeObj, sv.nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  int pseudoInverseGsl(vpMatrix Ap, double svThreshold = 1e-6)
    //

    //javadoc: VpMatrix::pseudoInverseGsl(Ap, svThreshold)

    public  int pseudoInverseGsl(VpMatrix Ap, double svThreshold)
    {
        
        int retVal = pseudoInverseGsl_0(nativeObj, Ap.nativeObj, svThreshold);
        
        return retVal;
    }
                    //javadoc: VpMatrix::pseudoInverseGsl(Ap)

    public  int pseudoInverseGsl(VpMatrix Ap)
    {
        
        int retVal = pseudoInverseGsl_1(nativeObj, Ap.nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  int pseudoInverseGsl(vpMatrix Ap, vpColVector sv, double svThreshold, vpMatrix imA, vpMatrix imAt, vpMatrix kerAt)
    //

    //javadoc: VpMatrix::pseudoInverseGsl(Ap, sv, svThreshold, imA, imAt, kerAt)

    public  int pseudoInverseGsl(VpMatrix Ap, VpColVector sv, double svThreshold, VpMatrix imA, VpMatrix imAt, VpMatrix kerAt)
    {
        
        int retVal = pseudoInverseGsl_2(nativeObj, Ap.nativeObj, sv.nativeObj, svThreshold, imA.nativeObj, imAt.nativeObj, kerAt.nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  int pseudoInverseGsl(vpMatrix Ap, vpColVector sv, double svThreshold = 1e-6)
    //

    //javadoc: VpMatrix::pseudoInverseGsl(Ap, sv, svThreshold)

    public  int pseudoInverseGsl(VpMatrix Ap, VpColVector sv, double svThreshold)
    {
        
        int retVal = pseudoInverseGsl_3(nativeObj, Ap.nativeObj, sv.nativeObj, svThreshold);
        
        return retVal;
    }
                    //javadoc: VpMatrix::pseudoInverseGsl(Ap, sv)

    public  int pseudoInverseGsl(VpMatrix Ap, VpColVector sv)
    {
        
        int retVal = pseudoInverseGsl_4(nativeObj, Ap.nativeObj, sv.nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  int pseudoInverseLapack(vpMatrix Ap, double svThreshold = 1e-6)
    //

    //javadoc: VpMatrix::pseudoInverseLapack(Ap, svThreshold)

    public  int pseudoInverseLapack(VpMatrix Ap, double svThreshold)
    {
        
        int retVal = pseudoInverseLapack_0(nativeObj, Ap.nativeObj, svThreshold);
        
        return retVal;
    }
                    //javadoc: VpMatrix::pseudoInverseLapack(Ap)

    public  int pseudoInverseLapack(VpMatrix Ap)
    {
        
        int retVal = pseudoInverseLapack_1(nativeObj, Ap.nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  int pseudoInverseLapack(vpMatrix Ap, vpColVector sv, double svThreshold, vpMatrix imA, vpMatrix imAt, vpMatrix kerAt)
    //

    //javadoc: VpMatrix::pseudoInverseLapack(Ap, sv, svThreshold, imA, imAt, kerAt)

    public  int pseudoInverseLapack(VpMatrix Ap, VpColVector sv, double svThreshold, VpMatrix imA, VpMatrix imAt, VpMatrix kerAt)
    {
        
        int retVal = pseudoInverseLapack_2(nativeObj, Ap.nativeObj, sv.nativeObj, svThreshold, imA.nativeObj, imAt.nativeObj, kerAt.nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  int pseudoInverseLapack(vpMatrix Ap, vpColVector sv, double svThreshold = 1e-6)
    //

    //javadoc: VpMatrix::pseudoInverseLapack(Ap, sv, svThreshold)

    public  int pseudoInverseLapack(VpMatrix Ap, VpColVector sv, double svThreshold)
    {
        
        int retVal = pseudoInverseLapack_3(nativeObj, Ap.nativeObj, sv.nativeObj, svThreshold);
        
        return retVal;
    }
                    //javadoc: VpMatrix::pseudoInverseLapack(Ap, sv)

    public  int pseudoInverseLapack(VpMatrix Ap, VpColVector sv)
    {
        
        int retVal = pseudoInverseLapack_4(nativeObj, Ap.nativeObj, sv.nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  int pseudoInverseOpenCV(vpMatrix Ap, double svThreshold = 1e-6)
    //

    //javadoc: VpMatrix::pseudoInverseOpenCV(Ap, svThreshold)

    public  int pseudoInverseOpenCV(VpMatrix Ap, double svThreshold)
    {
        
        int retVal = pseudoInverseOpenCV_0(nativeObj, Ap.nativeObj, svThreshold);
        
        return retVal;
    }
                    //javadoc: VpMatrix::pseudoInverseOpenCV(Ap)

    public  int pseudoInverseOpenCV(VpMatrix Ap)
    {
        
        int retVal = pseudoInverseOpenCV_1(nativeObj, Ap.nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  int pseudoInverseOpenCV(vpMatrix Ap, vpColVector sv, double svThreshold, vpMatrix imA, vpMatrix imAt, vpMatrix kerAt)
    //

    //javadoc: VpMatrix::pseudoInverseOpenCV(Ap, sv, svThreshold, imA, imAt, kerAt)

    public  int pseudoInverseOpenCV(VpMatrix Ap, VpColVector sv, double svThreshold, VpMatrix imA, VpMatrix imAt, VpMatrix kerAt)
    {
        
        int retVal = pseudoInverseOpenCV_2(nativeObj, Ap.nativeObj, sv.nativeObj, svThreshold, imA.nativeObj, imAt.nativeObj, kerAt.nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  int pseudoInverseOpenCV(vpMatrix Ap, vpColVector sv, double svThreshold = 1e-6)
    //

    //javadoc: VpMatrix::pseudoInverseOpenCV(Ap, sv, svThreshold)

    public  int pseudoInverseOpenCV(VpMatrix Ap, VpColVector sv, double svThreshold)
    {
        
        int retVal = pseudoInverseOpenCV_3(nativeObj, Ap.nativeObj, sv.nativeObj, svThreshold);
        
        return retVal;
    }
                    //javadoc: VpMatrix::pseudoInverseOpenCV(Ap, sv)

    public  int pseudoInverseOpenCV(VpMatrix Ap, VpColVector sv)
    {
        
        int retVal = pseudoInverseOpenCV_4(nativeObj, Ap.nativeObj, sv.nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  int qr(vpMatrix Q, vpMatrix R, bool full = false, bool squareR = false, double tol = 1e-6)
    //

    //javadoc: VpMatrix::qr(Q, R, full, squareR, tol)

    public  int qr(VpMatrix Q, VpMatrix R, boolean full, boolean squareR, double tol)
    {
        
        int retVal = qr_0(nativeObj, Q.nativeObj, R.nativeObj, full, squareR, tol);
        
        return retVal;
    }
                    //javadoc: VpMatrix::qr(Q, R)

    public  int qr(VpMatrix Q, VpMatrix R)
    {
        
        int retVal = qr_1(nativeObj, Q.nativeObj, R.nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  int qrPivot(vpMatrix Q, vpMatrix R, vpMatrix P, bool full = false, bool squareR = false, double tol = 1e-6)
    //

    //javadoc: VpMatrix::qrPivot(Q, R, P, full, squareR, tol)

    public  int qrPivot(VpMatrix Q, VpMatrix R, VpMatrix P, boolean full, boolean squareR, double tol)
    {
        
        int retVal = qrPivot_0(nativeObj, Q.nativeObj, R.nativeObj, P.nativeObj, full, squareR, tol);
        
        return retVal;
    }
                    //javadoc: VpMatrix::qrPivot(Q, R, P)

    public  int qrPivot(VpMatrix Q, VpMatrix R, VpMatrix P)
    {
        
        int retVal = qrPivot_1(nativeObj, Q.nativeObj, R.nativeObj, P.nativeObj);
        
        return retVal;
    }
                
    //
    // C++:  ostream cppPrint(ostream os, string matrixName = "A", bool octet = false)
    //

    // Return type 'ostream' is not supported, skipping the function


    //
    // C++:  ostream csvPrint(ostream os)
    //

    // Return type 'ostream' is not supported, skipping the function


    //
    // C++:  ostream maplePrint(ostream os)
    //

    // Return type 'ostream' is not supported, skipping the function


    //
    // C++:  ostream matlabPrint(ostream os)
    //

    // Return type 'ostream' is not supported, skipping the function


    //
    // C++:  void AAt(vpMatrix B)
    //

    //javadoc: VpMatrix::AAt(B)

    public  void AAt(VpMatrix B)
    {
        
        AAt_0(nativeObj, B.nativeObj);
        
        return;
    }
                
    //
    // C++:  void AtA(vpMatrix B)
    //

    //javadoc: VpMatrix::AtA(B)

    public  void AtA(VpMatrix B)
    {
        
        AtA_0(nativeObj, B.nativeObj);
        
        return;
    }
                
    //
    // C++: static void add2Matrices(vpColVector A, vpColVector B, vpColVector C)
    //

    //javadoc: VpMatrix::add2Matrices(A, B, C)

    public static void add2Matrices(VpColVector A, VpColVector B, VpColVector C)
    {
        
        add2Matrices_0(A.nativeObj, B.nativeObj, C.nativeObj);
        
        return;
    }
                
    //
    // C++: static void add2Matrices(vpMatrix A, vpMatrix B, vpMatrix C)
    //

    //javadoc: VpMatrix::add2Matrices(A, B, C)

    public static void add2Matrices(VpMatrix A, VpMatrix B, VpMatrix C)
    {
        
        add2Matrices_1(A.nativeObj, B.nativeObj, C.nativeObj);
        
        return;
    }
                
    //
    // C++: static void add2WeightedMatrices(vpMatrix A, double wA, vpMatrix B, double wB, vpMatrix C)
    //

    //javadoc: VpMatrix::add2WeightedMatrices(A, wA, B, wB, C)

    public static void add2WeightedMatrices(VpMatrix A, double wA, VpMatrix B, double wB, VpMatrix C)
    {
        
        add2WeightedMatrices_0(A.nativeObj, wA, B.nativeObj, wB, C.nativeObj);
        
        return;
    }
                
    //
    // C++:  void clear()
    //

    //javadoc: VpMatrix::clear()

    public  void clear()
    {
        
        clear_0(nativeObj);
        
        return;
    }
                
    //
    // C++: static void computeHLM(vpMatrix H, double alpha, vpMatrix HLM)
    //

    //javadoc: VpMatrix::computeHLM(H, alpha, HLM)

    public static void computeHLM(VpMatrix H, double alpha, VpMatrix HLM)
    {
        
        computeHLM_0(H.nativeObj, alpha, HLM.nativeObj);
        
        return;
    }
                
    //
    // C++: static void conv2(vpMatrix M, vpMatrix kernel, vpMatrix res, string mode = "full")
    //

    //javadoc: VpMatrix::conv2(M, kernel, res, mode)

    public static void conv2(VpMatrix M, VpMatrix kernel, VpMatrix res, String mode)
    {
        
        conv2_0(M.nativeObj, kernel.nativeObj, res.nativeObj, mode);
        
        return;
    }
                    //javadoc: VpMatrix::conv2(M, kernel, res)

    public static void conv2(VpMatrix M, VpMatrix kernel, VpMatrix res)
    {
        
        conv2_1(M.nativeObj, kernel.nativeObj, res.nativeObj);
        
        return;
    }
                
    //
    // C++: static void createDiagonalMatrix(vpColVector A, vpMatrix DA)
    //

    //javadoc: VpMatrix::createDiagonalMatrix(A, DA)

    public static void createDiagonalMatrix(VpColVector A, VpMatrix DA)
    {
        
        createDiagonalMatrix_0(A.nativeObj, DA.nativeObj);
        
        return;
    }
                
    //
    // C++:  void diag(double val = 1.0)
    //

    //javadoc: VpMatrix::diag(val)

    public  void diag(double val)
    {
        
        diag_0(nativeObj, val);
        
        return;
    }
                    //javadoc: VpMatrix::diag()

    public  void diag()
    {
        
        diag_1(nativeObj);
        
        return;
    }
                
    //
    // C++:  void diag(vpColVector A)
    //

    //javadoc: VpMatrix::diag(A)

    public  void diag(VpColVector A)
    {
        
        diag_2(nativeObj, A.nativeObj);
        
        return;
    }
                
    //
    // C++:  void eigenValues(vpColVector evalue, vpMatrix evector)
    //

    //javadoc: VpMatrix::eigenValues(evalue, evector)

    public  void eigenValues(VpColVector evalue, VpMatrix evector)
    {
        
        eigenValues_0(nativeObj, evalue.nativeObj, evector.nativeObj);
        
        return;
    }
                
    //
    // C++:  void eye(int m, int n)
    //

    //javadoc: VpMatrix::eye(m, n)

    public  void eye(int m, int n)
    {
        
        eye_0(nativeObj, m, n);
        
        return;
    }
                
    //
    // C++:  void eye(int n)
    //

    //javadoc: VpMatrix::eye(n)

    public  void eye(int n)
    {
        
        eye_1(nativeObj, n);
        
        return;
    }
                
    //
    // C++:  void eye()
    //

    //javadoc: VpMatrix::eye()

    public  void eye()
    {
        
        eye_2(nativeObj);
        
        return;
    }
                
    //
    // C++:  void init(vpMatrix M, int r, int c, int nrows, int ncols)
    //

    //javadoc: VpMatrix::init(M, r, c, nrows, ncols)

    public  void init(VpMatrix M, int r, int c, int nrows, int ncols)
    {
        
        init_0(nativeObj, M.nativeObj, r, c, nrows, ncols);
        
        return;
    }
                
    //
    // C++:  void insert(vpMatrix A, int r, int c)
    //

    //javadoc: VpMatrix::insert(A, r, c)

    public  void insert(VpMatrix A, int r, int c)
    {
        
        insert_0(nativeObj, A.nativeObj, r, c);
        
        return;
    }
                
    //
    // C++: static void insert(vpMatrix A, vpMatrix B, vpMatrix C, int r, int c)
    //

    //javadoc: VpMatrix::insert(A, B, C, r, c)

    public static void insert(VpMatrix A, VpMatrix B, VpMatrix C, int r, int c)
    {
        
        insert_1(A.nativeObj, B.nativeObj, C.nativeObj, r, c);
        
        return;
    }
                
    //
    // C++: static void juxtaposeMatrices(vpMatrix A, vpMatrix B, vpMatrix C)
    //

    //javadoc: VpMatrix::juxtaposeMatrices(A, B, C)

    public static void juxtaposeMatrices(VpMatrix A, VpMatrix B, VpMatrix C)
    {
        
        juxtaposeMatrices_0(A.nativeObj, B.nativeObj, C.nativeObj);
        
        return;
    }
                
    //
    // C++: static void kron(vpMatrix m1, vpMatrix m2, vpMatrix out)
    //

    //javadoc: VpMatrix::kron(m1, m2, out)

    public static void kron(VpMatrix m1, VpMatrix m2, VpMatrix out)
    {
        
        kron_0(m1.nativeObj, m2.nativeObj, out.nativeObj);
        
        return;
    }
                
    //
    // C++:  void kron(vpMatrix m1, vpMatrix out)
    //

    //javadoc: VpMatrix::kron(m1, out)

    public  void kron(VpMatrix m1, VpMatrix out)
    {
        
        kron_1(nativeObj, m1.nativeObj, out.nativeObj);
        
        return;
    }
                
    //
    // C++: static void mult2Matrices(vpMatrix A, vpColVector B, vpColVector C)
    //

    //javadoc: VpMatrix::mult2Matrices(A, B, C)

    public static void mult2Matrices(VpMatrix A, VpColVector B, VpColVector C)
    {
        
        mult2Matrices_0(A.nativeObj, B.nativeObj, C.nativeObj);
        
        return;
    }
                
    //
    // C++: static void mult2Matrices(vpMatrix A, vpMatrix B, vpHomogeneousMatrix C)
    //

    //javadoc: VpMatrix::mult2Matrices(A, B, C)

    public static void mult2Matrices(VpMatrix A, VpMatrix B, VpHomogeneousMatrix C)
    {
        
        mult2Matrices_1(A.nativeObj, B.nativeObj, C.nativeObj);
        
        return;
    }
                
    //
    // C++: static void mult2Matrices(vpMatrix A, vpMatrix B, vpMatrix C)
    //

    //javadoc: VpMatrix::mult2Matrices(A, B, C)

    public static void mult2Matrices(VpMatrix A, VpMatrix B, VpMatrix C)
    {
        
        mult2Matrices_2(A.nativeObj, B.nativeObj, C.nativeObj);
        
        return;
    }
                
    //
    // C++: static void mult2Matrices(vpMatrix A, vpMatrix B, vpRotationMatrix C)
    //

    // Unknown type 'vpRotationMatrix' (I), skipping the function


    //
    // C++: static void multMatrixVector(vpMatrix A, vpColVector v, vpColVector w)
    //

    //javadoc: VpMatrix::multMatrixVector(A, v, w)

    public static void multMatrixVector(VpMatrix A, VpColVector v, VpColVector w)
    {
        
        multMatrixVector_0(A.nativeObj, v.nativeObj, w.nativeObj);
        
        return;
    }
                
    //
    // C++: static void negateMatrix(vpMatrix A, vpMatrix C)
    //

    //javadoc: VpMatrix::negateMatrix(A, C)

    public static void negateMatrix(VpMatrix A, VpMatrix C)
    {
        
        negateMatrix_0(A.nativeObj, C.nativeObj);
        
        return;
    }
                
    //
    // C++:  void printSize()
    //

    //javadoc: VpMatrix::printSize()

    public  void printSize()
    {
        
        printSize_0(nativeObj);
        
        return;
    }
                
    //
    // C++:  void solveByQR(vpColVector b, vpColVector x)
    //

    //javadoc: VpMatrix::solveByQR(b, x)

    public  void solveByQR(VpColVector b, VpColVector x)
    {
        
        solveByQR_0(nativeObj, b.nativeObj, x.nativeObj);
        
        return;
    }
                
    //
    // C++:  void solveBySVD(vpColVector B, vpColVector x)
    //

    //javadoc: VpMatrix::solveBySVD(B, x)

    public  void solveBySVD(VpColVector B, VpColVector x)
    {
        
        solveBySVD_0(nativeObj, B.nativeObj, x.nativeObj);
        
        return;
    }
                
    //
    // C++:  void stack(vpColVector c)
    //

    //javadoc: VpMatrix::stack(c)

    public  void stack(VpColVector c)
    {
        
        stack_0(nativeObj, c.nativeObj);
        
        return;
    }
                
    //
    // C++: static void stack(vpMatrix A, vpColVector c, vpMatrix C)
    //

    //javadoc: VpMatrix::stack(A, c, C)

    public static void stack(VpMatrix A, VpColVector c, VpMatrix C)
    {
        
        stack_1(A.nativeObj, c.nativeObj, C.nativeObj);
        
        return;
    }
                
    //
    // C++: static void stack(vpMatrix A, vpMatrix B, vpMatrix C)
    //

    //javadoc: VpMatrix::stack(A, B, C)

    public static void stack(VpMatrix A, VpMatrix B, VpMatrix C)
    {
        
        stack_2(A.nativeObj, B.nativeObj, C.nativeObj);
        
        return;
    }
                
    //
    // C++: static void stack(vpMatrix A, vpRowVector r, vpMatrix C)
    //

    //javadoc: VpMatrix::stack(A, r, C)

    public static void stack(VpMatrix A, VpRowVector r, VpMatrix C)
    {
        
        stack_3(A.nativeObj, r.nativeObj, C.nativeObj);
        
        return;
    }
                
    //
    // C++:  void stack(vpMatrix A)
    //

    //javadoc: VpMatrix::stack(A)

    public  void stack(VpMatrix A)
    {
        
        stack_4(nativeObj, A.nativeObj);
        
        return;
    }
                
    //
    // C++:  void stack(vpRowVector r)
    //

    //javadoc: VpMatrix::stack(r)

    public  void stack(VpRowVector r)
    {
        
        stack_5(nativeObj, r.nativeObj);
        
        return;
    }
                
    //
    // C++:  void stackColumns(vpColVector out)
    //

    //javadoc: VpMatrix::stackColumns(out)

    public  void stackColumns(VpColVector out)
    {
        
        stackColumns_0(nativeObj, out.nativeObj);
        
        return;
    }
                
    //
    // C++:  void stackRows(vpRowVector out)
    //

    //javadoc: VpMatrix::stackRows(out)

    public  void stackRows(VpRowVector out)
    {
        
        stackRows_0(nativeObj, out.nativeObj);
        
        return;
    }
                
    //
    // C++: static void sub2Matrices(vpColVector A, vpColVector B, vpColVector C)
    //

    //javadoc: VpMatrix::sub2Matrices(A, B, C)

    public static void sub2Matrices(VpColVector A, VpColVector B, VpColVector C)
    {
        
        sub2Matrices_0(A.nativeObj, B.nativeObj, C.nativeObj);
        
        return;
    }
                
    //
    // C++: static void sub2Matrices(vpMatrix A, vpMatrix B, vpMatrix C)
    //

    //javadoc: VpMatrix::sub2Matrices(A, B, C)

    public static void sub2Matrices(VpMatrix A, VpMatrix B, VpMatrix C)
    {
        
        sub2Matrices_1(A.nativeObj, B.nativeObj, C.nativeObj);
        
        return;
    }
                
    //
    // C++:  void svd(vpColVector w, vpMatrix V)
    //

    //javadoc: VpMatrix::svd(w, V)

    public  void svd(VpColVector w, VpMatrix V)
    {
        
        svd_0(nativeObj, w.nativeObj, V.nativeObj);
        
        return;
    }
                
    //
    // C++:  void svdEigen3(vpColVector w, vpMatrix V)
    //

    //javadoc: VpMatrix::svdEigen3(w, V)

    public  void svdEigen3(VpColVector w, VpMatrix V)
    {
        
        svdEigen3_0(nativeObj, w.nativeObj, V.nativeObj);
        
        return;
    }
                
    //
    // C++:  void svdGsl(vpColVector w, vpMatrix V)
    //

    //javadoc: VpMatrix::svdGsl(w, V)

    public  void svdGsl(VpColVector w, VpMatrix V)
    {
        
        svdGsl_0(nativeObj, w.nativeObj, V.nativeObj);
        
        return;
    }
                
    //
    // C++:  void svdLapack(vpColVector w, vpMatrix V)
    //

    //javadoc: VpMatrix::svdLapack(w, V)

    public  void svdLapack(VpColVector w, VpMatrix V)
    {
        
        svdLapack_0(nativeObj, w.nativeObj, V.nativeObj);
        
        return;
    }
                
    //
    // C++:  void svdOpenCV(vpColVector w, vpMatrix V)
    //

    //javadoc: VpMatrix::svdOpenCV(w, V)

    public  void svdOpenCV(VpColVector w, VpMatrix V)
    {
        
        svdOpenCV_0(nativeObj, w.nativeObj, V.nativeObj);
        
        return;
    }
                
    //
    // C++:  void transpose(vpMatrix C)
    //

    //javadoc: VpMatrix::transpose(C)

    public  void transpose(VpMatrix C)
    {
        
        transpose_0(nativeObj, C.nativeObj);
        
        return;
    }
                
    //
    // C++:  vpColVector eigenValues()
    //

    //javadoc: VpMatrix::eigenValues()

    public  VpColVector eigenValues()
    {
        
        VpColVector retVal = new VpColVector(eigenValues_1(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpColVector getCol(int j, int i_begin, int size)
    //

    //javadoc: VpMatrix::getCol(j, i_begin, size)

    public  VpColVector getCol(int j, int i_begin, int size)
    {
        
        VpColVector retVal = new VpColVector(getCol_0(nativeObj, j, i_begin, size));
        
        return retVal;
    }
                
    //
    // C++:  vpColVector getCol(int j)
    //

    //javadoc: VpMatrix::getCol(j)

    public  VpColVector getCol(int j)
    {
        
        VpColVector retVal = new VpColVector(getCol_1(nativeObj, j));
        
        return retVal;
    }
                
    //
    // C++:  vpColVector solveByQR(vpColVector b)
    //

    //javadoc: VpMatrix::solveByQR(b)

    public  VpColVector solveByQR(VpColVector b)
    {
        
        VpColVector retVal = new VpColVector(solveByQR_1(nativeObj, b.nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpColVector solveBySVD(vpColVector B)
    //

    //javadoc: VpMatrix::solveBySVD(B)

    public  VpColVector solveBySVD(VpColVector B)
    {
        
        VpColVector retVal = new VpColVector(solveBySVD_1(nativeObj, B.nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpColVector stackColumns()
    //

    //javadoc: VpMatrix::stackColumns()

    public  VpColVector stackColumns()
    {
        
        VpColVector retVal = new VpColVector(stackColumns_1(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix AAt()
    //

    //javadoc: VpMatrix::AAt()

    public  VpMatrix AAt()
    {
        
        VpMatrix retVal = new VpMatrix(AAt_1(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix AtA()
    //

    //javadoc: VpMatrix::AtA()

    public  VpMatrix AtA()
    {
        
        VpMatrix retVal = new VpMatrix(AtA_1(nativeObj));
        
        return retVal;
    }
                
    //
    // C++: static vpMatrix computeCovarianceMatrix(vpMatrix A, vpColVector x, vpColVector b, vpMatrix w)
    //

    //javadoc: VpMatrix::computeCovarianceMatrix(A, x, b, w)

    public static VpMatrix computeCovarianceMatrix(VpMatrix A, VpColVector x, VpColVector b, VpMatrix w)
    {
        
        VpMatrix retVal = new VpMatrix(computeCovarianceMatrix_0(A.nativeObj, x.nativeObj, b.nativeObj, w.nativeObj));
        
        return retVal;
    }
                
    //
    // C++: static vpMatrix computeCovarianceMatrix(vpMatrix A, vpColVector x, vpColVector b)
    //

    //javadoc: VpMatrix::computeCovarianceMatrix(A, x, b)

    public static VpMatrix computeCovarianceMatrix(VpMatrix A, VpColVector x, VpColVector b)
    {
        
        VpMatrix retVal = new VpMatrix(computeCovarianceMatrix_1(A.nativeObj, x.nativeObj, b.nativeObj));
        
        return retVal;
    }
                
    //
    // C++: static vpMatrix computeCovarianceMatrixVVS(vpHomogeneousMatrix cMo, vpColVector deltaS, vpMatrix Ls, vpMatrix W)
    //

    //javadoc: VpMatrix::computeCovarianceMatrixVVS(cMo, deltaS, Ls, W)

    public static VpMatrix computeCovarianceMatrixVVS(VpHomogeneousMatrix cMo, VpColVector deltaS, VpMatrix Ls, VpMatrix W)
    {
        
        VpMatrix retVal = new VpMatrix(computeCovarianceMatrixVVS_0(cMo.nativeObj, deltaS.nativeObj, Ls.nativeObj, W.nativeObj));
        
        return retVal;
    }
                
    //
    // C++: static vpMatrix computeCovarianceMatrixVVS(vpHomogeneousMatrix cMo, vpColVector deltaS, vpMatrix Ls)
    //

    //javadoc: VpMatrix::computeCovarianceMatrixVVS(cMo, deltaS, Ls)

    public static VpMatrix computeCovarianceMatrixVVS(VpHomogeneousMatrix cMo, VpColVector deltaS, VpMatrix Ls)
    {
        
        VpMatrix retVal = new VpMatrix(computeCovarianceMatrixVVS_1(cMo.nativeObj, deltaS.nativeObj, Ls.nativeObj));
        
        return retVal;
    }
                
    //
    // C++: static vpMatrix conv2(vpMatrix M, vpMatrix kernel, string mode = "full")
    //

    //javadoc: VpMatrix::conv2(M, kernel, mode)

    public static VpMatrix conv2(VpMatrix M, VpMatrix kernel, String mode)
    {
        
        VpMatrix retVal = new VpMatrix(conv2_2(M.nativeObj, kernel.nativeObj, mode));
        
        return retVal;
    }
                    //javadoc: VpMatrix::conv2(M, kernel)

    public static VpMatrix conv2(VpMatrix M, VpMatrix kernel)
    {
        
        VpMatrix retVal = new VpMatrix(conv2_3(M.nativeObj, kernel.nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix expm()
    //

    //javadoc: VpMatrix::expm()

    public  VpMatrix expm()
    {
        
        VpMatrix retVal = new VpMatrix(expm_0(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix extract(int r, int c, int nrows, int ncols)
    //

    //javadoc: VpMatrix::extract(r, c, nrows, ncols)

    public  VpMatrix extract(int r, int c, int nrows, int ncols)
    {
        
        VpMatrix retVal = new VpMatrix(extract_0(nativeObj, r, c, nrows, ncols));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix hadamard(vpMatrix m)
    //

    //javadoc: VpMatrix::hadamard(m)

    public  VpMatrix hadamard(VpMatrix m)
    {
        
        VpMatrix retVal = new VpMatrix(hadamard_0(nativeObj, m.nativeObj));
        
        return retVal;
    }
                
    //
    // C++: static vpMatrix insert(vpMatrix A, vpMatrix B, int r, int c)
    //

    //javadoc: VpMatrix::insert(A, B, r, c)

    public static VpMatrix insert(VpMatrix A, VpMatrix B, int r, int c)
    {
        
        VpMatrix retVal = new VpMatrix(insert_2(A.nativeObj, B.nativeObj, r, c));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix inverseByCholesky()
    //

    //javadoc: VpMatrix::inverseByCholesky()

    public  VpMatrix inverseByCholesky()
    {
        
        VpMatrix retVal = new VpMatrix(inverseByCholesky_0(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix inverseByCholeskyLapack()
    //

    //javadoc: VpMatrix::inverseByCholeskyLapack()

    public  VpMatrix inverseByCholeskyLapack()
    {
        
        VpMatrix retVal = new VpMatrix(inverseByCholeskyLapack_0(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix inverseByCholeskyOpenCV()
    //

    //javadoc: VpMatrix::inverseByCholeskyOpenCV()

    public  VpMatrix inverseByCholeskyOpenCV()
    {
        
        VpMatrix retVal = new VpMatrix(inverseByCholeskyOpenCV_0(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix inverseByLU()
    //

    //javadoc: VpMatrix::inverseByLU()

    public  VpMatrix inverseByLU()
    {
        
        VpMatrix retVal = new VpMatrix(inverseByLU_0(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix inverseByLUEigen3()
    //

    //javadoc: VpMatrix::inverseByLUEigen3()

    public  VpMatrix inverseByLUEigen3()
    {
        
        VpMatrix retVal = new VpMatrix(inverseByLUEigen3_0(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix inverseByLUGsl()
    //

    //javadoc: VpMatrix::inverseByLUGsl()

    public  VpMatrix inverseByLUGsl()
    {
        
        VpMatrix retVal = new VpMatrix(inverseByLUGsl_0(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix inverseByLULapack()
    //

    //javadoc: VpMatrix::inverseByLULapack()

    public  VpMatrix inverseByLULapack()
    {
        
        VpMatrix retVal = new VpMatrix(inverseByLULapack_0(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix inverseByLUOpenCV()
    //

    //javadoc: VpMatrix::inverseByLUOpenCV()

    public  VpMatrix inverseByLUOpenCV()
    {
        
        VpMatrix retVal = new VpMatrix(inverseByLUOpenCV_0(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix inverseByQR()
    //

    //javadoc: VpMatrix::inverseByQR()

    public  VpMatrix inverseByQR()
    {
        
        VpMatrix retVal = new VpMatrix(inverseByQR_0(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix inverseByQRLapack()
    //

    //javadoc: VpMatrix::inverseByQRLapack()

    public  VpMatrix inverseByQRLapack()
    {
        
        VpMatrix retVal = new VpMatrix(inverseByQRLapack_0(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix inverseTriangular(bool upper = true)
    //

    //javadoc: VpMatrix::inverseTriangular(upper)

    public  VpMatrix inverseTriangular(boolean upper)
    {
        
        VpMatrix retVal = new VpMatrix(inverseTriangular_0(nativeObj, upper));
        
        return retVal;
    }
                    //javadoc: VpMatrix::inverseTriangular()

    public  VpMatrix inverseTriangular()
    {
        
        VpMatrix retVal = new VpMatrix(inverseTriangular_1(nativeObj));
        
        return retVal;
    }
                
    //
    // C++: static vpMatrix juxtaposeMatrices(vpMatrix A, vpMatrix B)
    //

    //javadoc: VpMatrix::juxtaposeMatrices(A, B)

    public static VpMatrix juxtaposeMatrices(VpMatrix A, VpMatrix B)
    {
        
        VpMatrix retVal = new VpMatrix(juxtaposeMatrices_1(A.nativeObj, B.nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix kron(vpMatrix m1)
    //

    //javadoc: VpMatrix::kron(m1)

    public  VpMatrix kron(VpMatrix m1)
    {
        
        VpMatrix retVal = new VpMatrix(kron_2(nativeObj, m1.nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix pseudoInverse(double svThreshold = 1e-6)
    //

    //javadoc: VpMatrix::pseudoInverse(svThreshold)

    public  VpMatrix pseudoInverse(double svThreshold)
    {
        
        VpMatrix retVal = new VpMatrix(pseudoInverse_6(nativeObj, svThreshold));
        
        return retVal;
    }
                    //javadoc: VpMatrix::pseudoInverse()

    public  VpMatrix pseudoInverse()
    {
        
        VpMatrix retVal = new VpMatrix(pseudoInverse_7(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix pseudoInverseEigen3(double svThreshold = 1e-6)
    //

    //javadoc: VpMatrix::pseudoInverseEigen3(svThreshold)

    public  VpMatrix pseudoInverseEigen3(double svThreshold)
    {
        
        VpMatrix retVal = new VpMatrix(pseudoInverseEigen3_5(nativeObj, svThreshold));
        
        return retVal;
    }
                    //javadoc: VpMatrix::pseudoInverseEigen3()

    public  VpMatrix pseudoInverseEigen3()
    {
        
        VpMatrix retVal = new VpMatrix(pseudoInverseEigen3_6(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix pseudoInverseGsl(double svThreshold = 1e-6)
    //

    //javadoc: VpMatrix::pseudoInverseGsl(svThreshold)

    public  VpMatrix pseudoInverseGsl(double svThreshold)
    {
        
        VpMatrix retVal = new VpMatrix(pseudoInverseGsl_5(nativeObj, svThreshold));
        
        return retVal;
    }
                    //javadoc: VpMatrix::pseudoInverseGsl()

    public  VpMatrix pseudoInverseGsl()
    {
        
        VpMatrix retVal = new VpMatrix(pseudoInverseGsl_6(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix pseudoInverseLapack(double svThreshold = 1e-6)
    //

    //javadoc: VpMatrix::pseudoInverseLapack(svThreshold)

    public  VpMatrix pseudoInverseLapack(double svThreshold)
    {
        
        VpMatrix retVal = new VpMatrix(pseudoInverseLapack_5(nativeObj, svThreshold));
        
        return retVal;
    }
                    //javadoc: VpMatrix::pseudoInverseLapack()

    public  VpMatrix pseudoInverseLapack()
    {
        
        VpMatrix retVal = new VpMatrix(pseudoInverseLapack_6(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix pseudoInverseOpenCV(double svThreshold = 1e-6)
    //

    //javadoc: VpMatrix::pseudoInverseOpenCV(svThreshold)

    public  VpMatrix pseudoInverseOpenCV(double svThreshold)
    {
        
        VpMatrix retVal = new VpMatrix(pseudoInverseOpenCV_5(nativeObj, svThreshold));
        
        return retVal;
    }
                    //javadoc: VpMatrix::pseudoInverseOpenCV()

    public  VpMatrix pseudoInverseOpenCV()
    {
        
        VpMatrix retVal = new VpMatrix(pseudoInverseOpenCV_6(nativeObj));
        
        return retVal;
    }
                
    //
    // C++: static vpMatrix stack(vpMatrix A, vpColVector c)
    //

    //javadoc: VpMatrix::stack(A, c)

    public static VpMatrix stack(VpMatrix A, VpColVector c)
    {
        
        VpMatrix retVal = new VpMatrix(stack_6(A.nativeObj, c.nativeObj));
        
        return retVal;
    }
                
    //
    // C++: static vpMatrix stack(vpMatrix A, vpMatrix B)
    //

    //javadoc: VpMatrix::stack(A, B)

    public static VpMatrix stack(VpMatrix A, VpMatrix B)
    {
        
        VpMatrix retVal = new VpMatrix(stack_7(A.nativeObj, B.nativeObj));
        
        return retVal;
    }
                
    //
    // C++: static vpMatrix stack(vpMatrix A, vpRowVector r)
    //

    //javadoc: VpMatrix::stack(A, r)

    public static VpMatrix stack(VpMatrix A, VpRowVector r)
    {
        
        VpMatrix retVal = new VpMatrix(stack_8(A.nativeObj, r.nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix t()
    //

    //javadoc: VpMatrix::t()

    public  VpMatrix t()
    {
        
        VpMatrix retVal = new VpMatrix(t_0(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpMatrix transpose()
    //

    //javadoc: VpMatrix::transpose()

    public  VpMatrix transpose()
    {
        
        VpMatrix retVal = new VpMatrix(transpose_1(nativeObj));
        
        return retVal;
    }
                
    //
    // C++:  vpRowVector getRow(int i, int j_begin, int size)
    //

    //javadoc: VpMatrix::getRow(i, j_begin, size)

    public  VpRowVector getRow(int i, int j_begin, int size)
    {
        
        VpRowVector retVal = new VpRowVector(getRow_0(nativeObj, i, j_begin, size));
        
        return retVal;
    }
                
    //
    // C++:  vpRowVector getRow(int i)
    //

    //javadoc: VpMatrix::getRow(i)

    public  VpRowVector getRow(int i)
    {
        
        VpRowVector retVal = new VpRowVector(getRow_1(nativeObj, i));
        
        return retVal;
    }
                
    //
    // C++:  vpRowVector stackRows()
    //

    //javadoc: VpMatrix::stackRows()

    public  VpRowVector stackRows()
    {
        
        VpRowVector retVal = new VpRowVector(stackRows_1(nativeObj));
        
        return retVal;
    }
                
	
	
    @Override
    public String toString(){
        return toString(nativeObj);
    }
                
    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }
                


    // C++:   vpMatrix(int r, int c, double val)
    private static native long VpMatrix_0(int r, int c, double val);

    // C++:   vpMatrix(int r, int c)
    private static native long VpMatrix_1(int r, int c);

    // C++:   vpMatrix(vpMatrix A)
    private static native long VpMatrix_2(long A_nativeObj);

    // C++:   vpMatrix(vpMatrix M, int r, int c, int nrows, int ncols)
    private static native long VpMatrix_3(long M_nativeObj, int r, int c, int nrows, int ncols);

    // C++:   vpMatrix()
    private static native long VpMatrix_4();

    // C++:  double cond()
    private static native double cond_0(long nativeObj);

    // C++:  double detByLU()
    private static native double detByLU_0(long nativeObj);

    // C++:  double detByLUEigen3()
    private static native double detByLUEigen3_0(long nativeObj);

    // C++:  double detByLUGsl()
    private static native double detByLUGsl_0(long nativeObj);

    // C++:  double detByLULapack()
    private static native double detByLULapack_0(long nativeObj);

    // C++:  double detByLUOpenCV()
    private static native double detByLUOpenCV_0(long nativeObj);

    // C++:  double euclideanNorm()
    private static native double euclideanNorm_0(long nativeObj);

    // C++:  double infinityNorm()
    private static native double infinityNorm_0(long nativeObj);

    // C++:  double sum()
    private static native double sum_0(long nativeObj);

    // C++:  double sumSquare()
    private static native double sumSquare_0(long nativeObj);

    // C++:  int kernel(vpMatrix kerAt, double svThreshold = 1e-6)
    private static native int kernel_0(long nativeObj, long kerAt_nativeObj, double svThreshold);
    private static native int kernel_1(long nativeObj, long kerAt_nativeObj);

    // C++:  int pseudoInverse(vpMatrix Ap, double svThreshold = 1e-6)
    private static native int pseudoInverse_0(long nativeObj, long Ap_nativeObj, double svThreshold);
    private static native int pseudoInverse_1(long nativeObj, long Ap_nativeObj);

    // C++:  int pseudoInverse(vpMatrix Ap, vpColVector sv, double svThreshold, vpMatrix imA, vpMatrix imAt, vpMatrix kerAt)
    private static native int pseudoInverse_2(long nativeObj, long Ap_nativeObj, long sv_nativeObj, double svThreshold, long imA_nativeObj, long imAt_nativeObj, long kerAt_nativeObj);

    // C++:  int pseudoInverse(vpMatrix Ap, vpColVector sv, double svThreshold, vpMatrix imA, vpMatrix imAt)
    private static native int pseudoInverse_3(long nativeObj, long Ap_nativeObj, long sv_nativeObj, double svThreshold, long imA_nativeObj, long imAt_nativeObj);

    // C++:  int pseudoInverse(vpMatrix Ap, vpColVector sv, double svThreshold = 1e-6)
    private static native int pseudoInverse_4(long nativeObj, long Ap_nativeObj, long sv_nativeObj, double svThreshold);
    private static native int pseudoInverse_5(long nativeObj, long Ap_nativeObj, long sv_nativeObj);

    // C++:  int pseudoInverseEigen3(vpMatrix Ap, double svThreshold = 1e-6)
    private static native int pseudoInverseEigen3_0(long nativeObj, long Ap_nativeObj, double svThreshold);
    private static native int pseudoInverseEigen3_1(long nativeObj, long Ap_nativeObj);

    // C++:  int pseudoInverseEigen3(vpMatrix Ap, vpColVector sv, double svThreshold, vpMatrix imA, vpMatrix imAt, vpMatrix kerAt)
    private static native int pseudoInverseEigen3_2(long nativeObj, long Ap_nativeObj, long sv_nativeObj, double svThreshold, long imA_nativeObj, long imAt_nativeObj, long kerAt_nativeObj);

    // C++:  int pseudoInverseEigen3(vpMatrix Ap, vpColVector sv, double svThreshold = 1e-6)
    private static native int pseudoInverseEigen3_3(long nativeObj, long Ap_nativeObj, long sv_nativeObj, double svThreshold);
    private static native int pseudoInverseEigen3_4(long nativeObj, long Ap_nativeObj, long sv_nativeObj);

    // C++:  int pseudoInverseGsl(vpMatrix Ap, double svThreshold = 1e-6)
    private static native int pseudoInverseGsl_0(long nativeObj, long Ap_nativeObj, double svThreshold);
    private static native int pseudoInverseGsl_1(long nativeObj, long Ap_nativeObj);

    // C++:  int pseudoInverseGsl(vpMatrix Ap, vpColVector sv, double svThreshold, vpMatrix imA, vpMatrix imAt, vpMatrix kerAt)
    private static native int pseudoInverseGsl_2(long nativeObj, long Ap_nativeObj, long sv_nativeObj, double svThreshold, long imA_nativeObj, long imAt_nativeObj, long kerAt_nativeObj);

    // C++:  int pseudoInverseGsl(vpMatrix Ap, vpColVector sv, double svThreshold = 1e-6)
    private static native int pseudoInverseGsl_3(long nativeObj, long Ap_nativeObj, long sv_nativeObj, double svThreshold);
    private static native int pseudoInverseGsl_4(long nativeObj, long Ap_nativeObj, long sv_nativeObj);

    // C++:  int pseudoInverseLapack(vpMatrix Ap, double svThreshold = 1e-6)
    private static native int pseudoInverseLapack_0(long nativeObj, long Ap_nativeObj, double svThreshold);
    private static native int pseudoInverseLapack_1(long nativeObj, long Ap_nativeObj);

    // C++:  int pseudoInverseLapack(vpMatrix Ap, vpColVector sv, double svThreshold, vpMatrix imA, vpMatrix imAt, vpMatrix kerAt)
    private static native int pseudoInverseLapack_2(long nativeObj, long Ap_nativeObj, long sv_nativeObj, double svThreshold, long imA_nativeObj, long imAt_nativeObj, long kerAt_nativeObj);

    // C++:  int pseudoInverseLapack(vpMatrix Ap, vpColVector sv, double svThreshold = 1e-6)
    private static native int pseudoInverseLapack_3(long nativeObj, long Ap_nativeObj, long sv_nativeObj, double svThreshold);
    private static native int pseudoInverseLapack_4(long nativeObj, long Ap_nativeObj, long sv_nativeObj);

    // C++:  int pseudoInverseOpenCV(vpMatrix Ap, double svThreshold = 1e-6)
    private static native int pseudoInverseOpenCV_0(long nativeObj, long Ap_nativeObj, double svThreshold);
    private static native int pseudoInverseOpenCV_1(long nativeObj, long Ap_nativeObj);

    // C++:  int pseudoInverseOpenCV(vpMatrix Ap, vpColVector sv, double svThreshold, vpMatrix imA, vpMatrix imAt, vpMatrix kerAt)
    private static native int pseudoInverseOpenCV_2(long nativeObj, long Ap_nativeObj, long sv_nativeObj, double svThreshold, long imA_nativeObj, long imAt_nativeObj, long kerAt_nativeObj);

    // C++:  int pseudoInverseOpenCV(vpMatrix Ap, vpColVector sv, double svThreshold = 1e-6)
    private static native int pseudoInverseOpenCV_3(long nativeObj, long Ap_nativeObj, long sv_nativeObj, double svThreshold);
    private static native int pseudoInverseOpenCV_4(long nativeObj, long Ap_nativeObj, long sv_nativeObj);

    // C++:  int qr(vpMatrix Q, vpMatrix R, bool full = false, bool squareR = false, double tol = 1e-6)
    private static native int qr_0(long nativeObj, long Q_nativeObj, long R_nativeObj, boolean full, boolean squareR, double tol);
    private static native int qr_1(long nativeObj, long Q_nativeObj, long R_nativeObj);

    // C++:  int qrPivot(vpMatrix Q, vpMatrix R, vpMatrix P, bool full = false, bool squareR = false, double tol = 1e-6)
    private static native int qrPivot_0(long nativeObj, long Q_nativeObj, long R_nativeObj, long P_nativeObj, boolean full, boolean squareR, double tol);
    private static native int qrPivot_1(long nativeObj, long Q_nativeObj, long R_nativeObj, long P_nativeObj);

    // C++:  void AAt(vpMatrix B)
    private static native void AAt_0(long nativeObj, long B_nativeObj);

    // C++:  void AtA(vpMatrix B)
    private static native void AtA_0(long nativeObj, long B_nativeObj);

    // C++: static void add2Matrices(vpColVector A, vpColVector B, vpColVector C)
    private static native void add2Matrices_0(long A_nativeObj, long B_nativeObj, long C_nativeObj);

    // C++: static void add2Matrices(vpMatrix A, vpMatrix B, vpMatrix C)
    private static native void add2Matrices_1(long A_nativeObj, long B_nativeObj, long C_nativeObj);

    // C++: static void add2WeightedMatrices(vpMatrix A, double wA, vpMatrix B, double wB, vpMatrix C)
    private static native void add2WeightedMatrices_0(long A_nativeObj, double wA, long B_nativeObj, double wB, long C_nativeObj);

    // C++:  void clear()
    private static native void clear_0(long nativeObj);

    // C++: static void computeHLM(vpMatrix H, double alpha, vpMatrix HLM)
    private static native void computeHLM_0(long H_nativeObj, double alpha, long HLM_nativeObj);

    // C++: static void conv2(vpMatrix M, vpMatrix kernel, vpMatrix res, string mode = "full")
    private static native void conv2_0(long M_nativeObj, long kernel_nativeObj, long res_nativeObj, String mode);
    private static native void conv2_1(long M_nativeObj, long kernel_nativeObj, long res_nativeObj);

    // C++: static void createDiagonalMatrix(vpColVector A, vpMatrix DA)
    private static native void createDiagonalMatrix_0(long A_nativeObj, long DA_nativeObj);

    // C++:  void diag(double val = 1.0)
    private static native void diag_0(long nativeObj, double val);
    private static native void diag_1(long nativeObj);

    // C++:  void diag(vpColVector A)
    private static native void diag_2(long nativeObj, long A_nativeObj);

    // C++:  void eigenValues(vpColVector evalue, vpMatrix evector)
    private static native void eigenValues_0(long nativeObj, long evalue_nativeObj, long evector_nativeObj);

    // C++:  void eye(int m, int n)
    private static native void eye_0(long nativeObj, int m, int n);

    // C++:  void eye(int n)
    private static native void eye_1(long nativeObj, int n);

    // C++:  void eye()
    private static native void eye_2(long nativeObj);

    // C++:  void init(vpMatrix M, int r, int c, int nrows, int ncols)
    private static native void init_0(long nativeObj, long M_nativeObj, int r, int c, int nrows, int ncols);

    // C++:  void insert(vpMatrix A, int r, int c)
    private static native void insert_0(long nativeObj, long A_nativeObj, int r, int c);

    // C++: static void insert(vpMatrix A, vpMatrix B, vpMatrix C, int r, int c)
    private static native void insert_1(long A_nativeObj, long B_nativeObj, long C_nativeObj, int r, int c);

    // C++: static void juxtaposeMatrices(vpMatrix A, vpMatrix B, vpMatrix C)
    private static native void juxtaposeMatrices_0(long A_nativeObj, long B_nativeObj, long C_nativeObj);

    // C++: static void kron(vpMatrix m1, vpMatrix m2, vpMatrix out)
    private static native void kron_0(long m1_nativeObj, long m2_nativeObj, long out_nativeObj);

    // C++:  void kron(vpMatrix m1, vpMatrix out)
    private static native void kron_1(long nativeObj, long m1_nativeObj, long out_nativeObj);

    // C++: static void mult2Matrices(vpMatrix A, vpColVector B, vpColVector C)
    private static native void mult2Matrices_0(long A_nativeObj, long B_nativeObj, long C_nativeObj);

    // C++: static void mult2Matrices(vpMatrix A, vpMatrix B, vpHomogeneousMatrix C)
    private static native void mult2Matrices_1(long A_nativeObj, long B_nativeObj, long C_nativeObj);

    // C++: static void mult2Matrices(vpMatrix A, vpMatrix B, vpMatrix C)
    private static native void mult2Matrices_2(long A_nativeObj, long B_nativeObj, long C_nativeObj);

    // C++: static void multMatrixVector(vpMatrix A, vpColVector v, vpColVector w)
    private static native void multMatrixVector_0(long A_nativeObj, long v_nativeObj, long w_nativeObj);

    // C++: static void negateMatrix(vpMatrix A, vpMatrix C)
    private static native void negateMatrix_0(long A_nativeObj, long C_nativeObj);

    // C++:  void printSize()
    private static native void printSize_0(long nativeObj);

    // C++:  void solveByQR(vpColVector b, vpColVector x)
    private static native void solveByQR_0(long nativeObj, long b_nativeObj, long x_nativeObj);

    // C++:  void solveBySVD(vpColVector B, vpColVector x)
    private static native void solveBySVD_0(long nativeObj, long B_nativeObj, long x_nativeObj);

    // C++:  void stack(vpColVector c)
    private static native void stack_0(long nativeObj, long c_nativeObj);

    // C++: static void stack(vpMatrix A, vpColVector c, vpMatrix C)
    private static native void stack_1(long A_nativeObj, long c_nativeObj, long C_nativeObj);

    // C++: static void stack(vpMatrix A, vpMatrix B, vpMatrix C)
    private static native void stack_2(long A_nativeObj, long B_nativeObj, long C_nativeObj);

    // C++: static void stack(vpMatrix A, vpRowVector r, vpMatrix C)
    private static native void stack_3(long A_nativeObj, long r_nativeObj, long C_nativeObj);

    // C++:  void stack(vpMatrix A)
    private static native void stack_4(long nativeObj, long A_nativeObj);

    // C++:  void stack(vpRowVector r)
    private static native void stack_5(long nativeObj, long r_nativeObj);

    // C++:  void stackColumns(vpColVector out)
    private static native void stackColumns_0(long nativeObj, long out_nativeObj);

    // C++:  void stackRows(vpRowVector out)
    private static native void stackRows_0(long nativeObj, long out_nativeObj);

    // C++: static void sub2Matrices(vpColVector A, vpColVector B, vpColVector C)
    private static native void sub2Matrices_0(long A_nativeObj, long B_nativeObj, long C_nativeObj);

    // C++: static void sub2Matrices(vpMatrix A, vpMatrix B, vpMatrix C)
    private static native void sub2Matrices_1(long A_nativeObj, long B_nativeObj, long C_nativeObj);

    // C++:  void svd(vpColVector w, vpMatrix V)
    private static native void svd_0(long nativeObj, long w_nativeObj, long V_nativeObj);

    // C++:  void svdEigen3(vpColVector w, vpMatrix V)
    private static native void svdEigen3_0(long nativeObj, long w_nativeObj, long V_nativeObj);

    // C++:  void svdGsl(vpColVector w, vpMatrix V)
    private static native void svdGsl_0(long nativeObj, long w_nativeObj, long V_nativeObj);

    // C++:  void svdLapack(vpColVector w, vpMatrix V)
    private static native void svdLapack_0(long nativeObj, long w_nativeObj, long V_nativeObj);

    // C++:  void svdOpenCV(vpColVector w, vpMatrix V)
    private static native void svdOpenCV_0(long nativeObj, long w_nativeObj, long V_nativeObj);

    // C++:  void transpose(vpMatrix C)
    private static native void transpose_0(long nativeObj, long C_nativeObj);

    // C++:  vpColVector eigenValues()
    private static native long eigenValues_1(long nativeObj);

    // C++:  vpColVector getCol(int j, int i_begin, int size)
    private static native long getCol_0(long nativeObj, int j, int i_begin, int size);

    // C++:  vpColVector getCol(int j)
    private static native long getCol_1(long nativeObj, int j);

    // C++:  vpColVector solveByQR(vpColVector b)
    private static native long solveByQR_1(long nativeObj, long b_nativeObj);

    // C++:  vpColVector solveBySVD(vpColVector B)
    private static native long solveBySVD_1(long nativeObj, long B_nativeObj);

    // C++:  vpColVector stackColumns()
    private static native long stackColumns_1(long nativeObj);

    // C++:  vpMatrix AAt()
    private static native long AAt_1(long nativeObj);

    // C++:  vpMatrix AtA()
    private static native long AtA_1(long nativeObj);

    // C++: static vpMatrix computeCovarianceMatrix(vpMatrix A, vpColVector x, vpColVector b, vpMatrix w)
    private static native long computeCovarianceMatrix_0(long A_nativeObj, long x_nativeObj, long b_nativeObj, long w_nativeObj);

    // C++: static vpMatrix computeCovarianceMatrix(vpMatrix A, vpColVector x, vpColVector b)
    private static native long computeCovarianceMatrix_1(long A_nativeObj, long x_nativeObj, long b_nativeObj);

    // C++: static vpMatrix computeCovarianceMatrixVVS(vpHomogeneousMatrix cMo, vpColVector deltaS, vpMatrix Ls, vpMatrix W)
    private static native long computeCovarianceMatrixVVS_0(long cMo_nativeObj, long deltaS_nativeObj, long Ls_nativeObj, long W_nativeObj);

    // C++: static vpMatrix computeCovarianceMatrixVVS(vpHomogeneousMatrix cMo, vpColVector deltaS, vpMatrix Ls)
    private static native long computeCovarianceMatrixVVS_1(long cMo_nativeObj, long deltaS_nativeObj, long Ls_nativeObj);

    // C++: static vpMatrix conv2(vpMatrix M, vpMatrix kernel, string mode = "full")
    private static native long conv2_2(long M_nativeObj, long kernel_nativeObj, String mode);
    private static native long conv2_3(long M_nativeObj, long kernel_nativeObj);

    // C++:  vpMatrix expm()
    private static native long expm_0(long nativeObj);

    // C++:  vpMatrix extract(int r, int c, int nrows, int ncols)
    private static native long extract_0(long nativeObj, int r, int c, int nrows, int ncols);

    // C++:  vpMatrix hadamard(vpMatrix m)
    private static native long hadamard_0(long nativeObj, long m_nativeObj);

    // C++: static vpMatrix insert(vpMatrix A, vpMatrix B, int r, int c)
    private static native long insert_2(long A_nativeObj, long B_nativeObj, int r, int c);

    // C++:  vpMatrix inverseByCholesky()
    private static native long inverseByCholesky_0(long nativeObj);

    // C++:  vpMatrix inverseByCholeskyLapack()
    private static native long inverseByCholeskyLapack_0(long nativeObj);

    // C++:  vpMatrix inverseByCholeskyOpenCV()
    private static native long inverseByCholeskyOpenCV_0(long nativeObj);

    // C++:  vpMatrix inverseByLU()
    private static native long inverseByLU_0(long nativeObj);

    // C++:  vpMatrix inverseByLUEigen3()
    private static native long inverseByLUEigen3_0(long nativeObj);

    // C++:  vpMatrix inverseByLUGsl()
    private static native long inverseByLUGsl_0(long nativeObj);

    // C++:  vpMatrix inverseByLULapack()
    private static native long inverseByLULapack_0(long nativeObj);

    // C++:  vpMatrix inverseByLUOpenCV()
    private static native long inverseByLUOpenCV_0(long nativeObj);

    // C++:  vpMatrix inverseByQR()
    private static native long inverseByQR_0(long nativeObj);

    // C++:  vpMatrix inverseByQRLapack()
    private static native long inverseByQRLapack_0(long nativeObj);

    // C++:  vpMatrix inverseTriangular(bool upper = true)
    private static native long inverseTriangular_0(long nativeObj, boolean upper);
    private static native long inverseTriangular_1(long nativeObj);

    // C++: static vpMatrix juxtaposeMatrices(vpMatrix A, vpMatrix B)
    private static native long juxtaposeMatrices_1(long A_nativeObj, long B_nativeObj);

    // C++:  vpMatrix kron(vpMatrix m1)
    private static native long kron_2(long nativeObj, long m1_nativeObj);

    // C++:  vpMatrix pseudoInverse(double svThreshold = 1e-6)
    private static native long pseudoInverse_6(long nativeObj, double svThreshold);
    private static native long pseudoInverse_7(long nativeObj);

    // C++:  vpMatrix pseudoInverseEigen3(double svThreshold = 1e-6)
    private static native long pseudoInverseEigen3_5(long nativeObj, double svThreshold);
    private static native long pseudoInverseEigen3_6(long nativeObj);

    // C++:  vpMatrix pseudoInverseGsl(double svThreshold = 1e-6)
    private static native long pseudoInverseGsl_5(long nativeObj, double svThreshold);
    private static native long pseudoInverseGsl_6(long nativeObj);

    // C++:  vpMatrix pseudoInverseLapack(double svThreshold = 1e-6)
    private static native long pseudoInverseLapack_5(long nativeObj, double svThreshold);
    private static native long pseudoInverseLapack_6(long nativeObj);

    // C++:  vpMatrix pseudoInverseOpenCV(double svThreshold = 1e-6)
    private static native long pseudoInverseOpenCV_5(long nativeObj, double svThreshold);
    private static native long pseudoInverseOpenCV_6(long nativeObj);

    // C++: static vpMatrix stack(vpMatrix A, vpColVector c)
    private static native long stack_6(long A_nativeObj, long c_nativeObj);

    // C++: static vpMatrix stack(vpMatrix A, vpMatrix B)
    private static native long stack_7(long A_nativeObj, long B_nativeObj);

    // C++: static vpMatrix stack(vpMatrix A, vpRowVector r)
    private static native long stack_8(long A_nativeObj, long r_nativeObj);

    // C++:  vpMatrix t()
    private static native long t_0(long nativeObj);

    // C++:  vpMatrix transpose()
    private static native long transpose_1(long nativeObj);

    // C++:  vpRowVector getRow(int i, int j_begin, int size)
    private static native long getRow_0(long nativeObj, int i, int j_begin, int size);

    // C++:  vpRowVector getRow(int i)
    private static native long getRow_1(long nativeObj, int i);

    // C++:  vpRowVector stackRows()
    private static native long stackRows_1(long nativeObj);

	
	
    // native support for java toString()
    private static native String toString(long nativeObj);
                
    // native support for java finalize()
    private static native void delete(long nativeObj);
                
}
