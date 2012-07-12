/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.jllvm.bindings;

public class IPO {
  public static void LLVMAddArgumentPromotionPass(SWIGTYPE_p_LLVMOpaquePassManager PM) {
    IPOJNI.LLVMAddArgumentPromotionPass(SWIGTYPE_p_LLVMOpaquePassManager.getCPtr(PM));
  }

  public static void LLVMAddConstantMergePass(SWIGTYPE_p_LLVMOpaquePassManager PM) {
    IPOJNI.LLVMAddConstantMergePass(SWIGTYPE_p_LLVMOpaquePassManager.getCPtr(PM));
  }

  public static void LLVMAddDeadArgEliminationPass(SWIGTYPE_p_LLVMOpaquePassManager PM) {
    IPOJNI.LLVMAddDeadArgEliminationPass(SWIGTYPE_p_LLVMOpaquePassManager.getCPtr(PM));
  }

  public static void LLVMAddFunctionAttrsPass(SWIGTYPE_p_LLVMOpaquePassManager PM) {
    IPOJNI.LLVMAddFunctionAttrsPass(SWIGTYPE_p_LLVMOpaquePassManager.getCPtr(PM));
  }

  public static void LLVMAddFunctionInliningPass(SWIGTYPE_p_LLVMOpaquePassManager PM) {
    IPOJNI.LLVMAddFunctionInliningPass(SWIGTYPE_p_LLVMOpaquePassManager.getCPtr(PM));
  }

  public static void LLVMAddAlwaysInlinerPass(SWIGTYPE_p_LLVMOpaquePassManager PM) {
    IPOJNI.LLVMAddAlwaysInlinerPass(SWIGTYPE_p_LLVMOpaquePassManager.getCPtr(PM));
  }

  public static void LLVMAddGlobalDCEPass(SWIGTYPE_p_LLVMOpaquePassManager PM) {
    IPOJNI.LLVMAddGlobalDCEPass(SWIGTYPE_p_LLVMOpaquePassManager.getCPtr(PM));
  }

  public static void LLVMAddGlobalOptimizerPass(SWIGTYPE_p_LLVMOpaquePassManager PM) {
    IPOJNI.LLVMAddGlobalOptimizerPass(SWIGTYPE_p_LLVMOpaquePassManager.getCPtr(PM));
  }

  public static void LLVMAddIPConstantPropagationPass(SWIGTYPE_p_LLVMOpaquePassManager PM) {
    IPOJNI.LLVMAddIPConstantPropagationPass(SWIGTYPE_p_LLVMOpaquePassManager.getCPtr(PM));
  }

  public static void LLVMAddPruneEHPass(SWIGTYPE_p_LLVMOpaquePassManager PM) {
    IPOJNI.LLVMAddPruneEHPass(SWIGTYPE_p_LLVMOpaquePassManager.getCPtr(PM));
  }

  public static void LLVMAddIPSCCPPass(SWIGTYPE_p_LLVMOpaquePassManager PM) {
    IPOJNI.LLVMAddIPSCCPPass(SWIGTYPE_p_LLVMOpaquePassManager.getCPtr(PM));
  }

  public static void LLVMAddInternalizePass(SWIGTYPE_p_LLVMOpaquePassManager arg0, long AllButMain) {
    IPOJNI.LLVMAddInternalizePass(SWIGTYPE_p_LLVMOpaquePassManager.getCPtr(arg0), AllButMain);
  }

  public static void LLVMAddStripDeadPrototypesPass(SWIGTYPE_p_LLVMOpaquePassManager PM) {
    IPOJNI.LLVMAddStripDeadPrototypesPass(SWIGTYPE_p_LLVMOpaquePassManager.getCPtr(PM));
  }

  public static void LLVMAddStripSymbolsPass(SWIGTYPE_p_LLVMOpaquePassManager PM) {
    IPOJNI.LLVMAddStripSymbolsPass(SWIGTYPE_p_LLVMOpaquePassManager.getCPtr(PM));
  }

}
