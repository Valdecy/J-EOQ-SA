package javaEOQ04wb;

//Copyright @ 2014 by Valdecy Pereira

//This file is part of J-EOQ-SA.
//
//J-EOQ-SA is free software: you can redistribute it and/or modify
//it under the terms of the GNU General Public License as published by
//the Free Software Foundation, either version 3 of the License, or
//(at your option) any later version.
//
//J-EOQ-SA is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//GNU General Public License for more details.
//
//You should have received a copy of the GNU General Public License
//along with J-EOQ-SA.  If not, see <http://www.gnu.org/licenses/>.

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class KeyFieldControler extends PlainDocument{
	
	private static final long serialVersionUID = 1L;

	@Override
	public void insertString(int offset, String str, javax.swing.text.AttributeSet attr)
	throws BadLocationException{
		super.insertString(offset, str.replaceAll("[^0-9 | ^. | ^\u221E]",""), attr);
	}

	public void replace(int offset, String str, javax.swing.text.AttributeSet attr)
			throws BadLocationException{
				super.insertString(offset, str.replaceAll("[^0-9 | ^. | ^\u221E]",""), attr);
			}
}
