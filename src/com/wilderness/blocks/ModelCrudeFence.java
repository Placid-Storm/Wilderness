package com.wilderness.blocks;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCrudeFence extends ModelBase
{
  //fields
    ModelRenderer postOne;
    ModelRenderer postTwo;
    ModelRenderer postThree;
    ModelRenderer postFour;
    ModelRenderer postFive;
    ModelRenderer postSix;
    ModelRenderer postSeven;
    ModelRenderer postEight;
    ModelRenderer BarOne;
    ModelRenderer BarTwo;
  
  public ModelCrudeFence()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      postOne = new ModelRenderer(this, 0, 0);
      postOne.addBox(-2F, -13F, 0F, 2, 26, 2);
      postOne.setRotationPoint(-6F, 12F, 0F);
      postOne.setTextureSize(64, 64);
      postOne.mirror = true;
      setRotation(postOne, -0.2617994F, 0F, 0F);
      postTwo = new ModelRenderer(this, 0, 0);
      postTwo.addBox(-2F, -13F, 0F, 2, 26, 2);
      postTwo.setRotationPoint(-4F, 12F, 0F);
      postTwo.setTextureSize(64, 64);
      postTwo.mirror = true;
      setRotation(postTwo, 0.2617994F, 0F, 0F);
      postThree = new ModelRenderer(this, 0, 0);
      postThree.addBox(-2F, -13F, 0F, 2, 26, 2);
      postThree.setRotationPoint(-2F, 12F, 0F);
      postThree.setTextureSize(64, 64);
      postThree.mirror = true;
      setRotation(postThree, -0.2617994F, 0F, 0F);
      postFour = new ModelRenderer(this, 0, 0);
      postFour.addBox(-2F, -13F, 0F, 2, 26, 2);
      postFour.setRotationPoint(0F, 12F, 0F);
      postFour.setTextureSize(64, 64);
      postFour.mirror = true;
      setRotation(postFour, 0.2617994F, 0F, 0F);
      postFive = new ModelRenderer(this, 0, 0);
      postFive.addBox(0F, -13F, 0F, 2, 26, 2);
      postFive.setRotationPoint(0F, 12F, 0F);
      postFive.setTextureSize(64, 64);
      postFive.mirror = true;
      setRotation(postFive, -0.2617994F, 0F, 0F);
      postSix = new ModelRenderer(this, 0, 0);
      postSix.addBox(0F, -13F, 0F, 2, 26, 2);
      postSix.setRotationPoint(2F, 12F, 0F);
      postSix.setTextureSize(64, 64);
      postSix.mirror = true;
      setRotation(postSix, 0.2617994F, 0F, 0F);
      postSeven = new ModelRenderer(this, 0, 0);
      postSeven.addBox(0F, -13F, 0F, 2, 26, 2);
      postSeven.setRotationPoint(4F, 12F, 0F);
      postSeven.setTextureSize(64, 64);
      postSeven.mirror = true;
      setRotation(postSeven, -0.2617994F, 0F, 0F);
      postEight = new ModelRenderer(this, 0, 0);
      postEight.addBox(0F, -13F, 0F, 2, 26, 2);
      postEight.setRotationPoint(6F, 12F, 0F);
      postEight.setTextureSize(64, 64);
      postEight.mirror = true;
      setRotation(postEight, 0.2617994F, 0F, 0F);
      BarOne = new ModelRenderer(this, 0, 28);
      BarOne.addBox(-8F, 0F, 0F, 16, 2, 2);
      BarOne.setRotationPoint(0F, 3F, 0F);
      BarOne.setTextureSize(64, 64);
      BarOne.mirror = true;
      setRotation(BarOne, 0F, 0F, 0F);
      BarTwo = new ModelRenderer(this, 0, 28);
      BarTwo.addBox(-8F, 0F, 0F, 16, 2, 2);
      BarTwo.setRotationPoint(0F, 19F, 0F);
      BarTwo.setTextureSize(64, 64);
      BarTwo.mirror = true;
      setRotation(BarTwo, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5,entity);
    postOne.render(f5);
    postTwo.render(f5);
    postThree.render(f5);
    postFour.render(f5);
    postFive.render(f5);
    postSix.render(f5);
    postSeven.render(f5);
    postEight.render(f5);
    BarOne.render(f5);
    BarTwo.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5,entity);
  }

}
