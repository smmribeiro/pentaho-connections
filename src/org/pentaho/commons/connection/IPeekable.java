/*
 * Copyright 2009 Pentaho Corporation.  All rights reserved. 
 * This software was developed by Pentaho Corporation and is provided under the terms 
 * of the Mozilla Public License, Version 1.1, or any later version. You may not use 
 * this file except in compliance with the license. If you need a copy of the license, 
 * please go to http://www.mozilla.org/MPL/MPL-1.1.txt. The Original Code is the Pentaho 
 * BI Platform.  The Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the Mozilla Public License is distributed on an "AS IS" 
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to 
 * the license for the specific language governing your rights and limitations.
 *
 * Created Jan 15, 2009 
 * @author jdixon
 */

package org.pentaho.commons.connection;

public interface IPeekable {

  /**
   * Peeks into a result set object to get a preview of the next row of data.
   * This is an optional interface that IPentahoResultSet objects can
   * implement
   * @return
   */
  public Object[] peek();
  
}