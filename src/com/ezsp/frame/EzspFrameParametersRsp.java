package com.ezsp.frame;

public abstract class EzspFrameParametersRsp implements EzspFrameParameters{

	protected byte[] ezspFrameParametersRsp;
	
	public EzspFrameParametersRsp (byte[] _ezspFrameParametersRsp) {
		this.ezspFrameParametersRsp = _ezspFrameParametersRsp;
	}
}
