package com.educareappsltd.testapp.drawing;

public class MappingContent {
	
	int id,Letterimageid,PicImageId;
	float xPos,yPos,x1,y1,x2,y2;
	
	public MappingContent(int id1,int id2){
		this.Letterimageid=id1;
		this.PicImageId=id2;
	}
	public MappingContent(float x,float y){
		this.xPos=x;
		this.yPos=y;
	}
	public MappingContent(int id,float x1,float y1,float x2,float y2){
		this.id=id;
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}

}
