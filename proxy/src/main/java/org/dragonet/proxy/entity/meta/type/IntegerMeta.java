/*
 * GNU LESSER GENERAL PUBLIC LICENSE
 *                       Version 3, 29 June 2007
 *
 * Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/>
 * Everyone is permitted to copy and distribute verbatim copies
 * of this license document, but changing it is not allowed.
 *
 * You can view LICENCE file for details. 
 *
 * @author The Dragonet Team
 */
package org.dragonet.proxy.entity.meta.type;

import org.dragonet.proxy.entity.meta.EntityMetaData;
import org.dragonet.proxy.entity.meta.IEntityMetaDataObject;
import org.dragonet.proxy.utilities.BinaryStream;

public class IntegerMeta implements IEntityMetaDataObject {
	// vars
	public int data;

	// constructor
	public IntegerMeta(int data) {
		this.data = data;
	}

	// public
	public int type() {
		return EntityMetaData.Constants.DATA_TYPE_INT;
	}

	public void encode(BinaryStream out) {
		out.putVarInt(data);
	}

	// private

}
