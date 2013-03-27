/*******************************************************************************
 * Copyright (c) 2013 EclipseSource.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralf Sternberg - initial implementation and API
 ******************************************************************************/
package org.eclipse.rap.rwt.internal.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;


public class TestUtil {

  public static void assertException( Class<? extends Exception> type,
                                      String message,
                                      Runnable runnable )
  {
    try {
      runnable.run();
      fail( "Expected exception: " + type.getName() );
    } catch( Exception exception ) {
      assertSame( "type", type, exception.getClass() );
      assertEquals( "message", message, exception.getMessage() );
    }
  }

}
