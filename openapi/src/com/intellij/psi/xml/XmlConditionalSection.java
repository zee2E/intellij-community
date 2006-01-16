package com.intellij.psi.xml;

import com.intellij.psi.PsiElement;

/**
 * Created by IntelliJ IDEA.
 * User: maxim.mossienko
 * Date: Jan 13, 2006
 * Time: 6:56:44 PM
 * To change this template use File | Settings | File Templates.
 */
public interface XmlConditionalSection extends XmlElement {
  boolean isIncluded();
  PsiElement getBodyStart();
}
