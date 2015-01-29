package com.wilderness.blocks;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTikiTorch extends ModelBase
{
  //fields
    ModelRenderer ReedOne;
    ModelRenderer ReedTwo;
    ModelRenderer ReedThree;
    ModelRenderer TorchOne;
    ModelRenderer TorchTwo;
    ModelRenderer TorchThree;
    ModelRenderer Binding;
  
  public ModelTikiTorch()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      ReedOne = new ModelRenderer(this, 0, 0);
      ReedOne.addBox(-1F, -4F, -1F, 2, 30, 2);
      ReedOne.setRotationPoint(0F, 0F, 1F);
      ReedOne.setTextureSize(64, 32);
      ReedOne.mirror = true;
      setRotation(ReedOne, -0.2617994F, 0F, 0F);
      ReedTwo = new ModelRenderer(this, 0, 0);
      ReedTwo.addBox(-1F, -4F, -1F, 2, 30, 2);
      ReedTwo.setRotationPoint(0F, 0F, 1F);
      ReedTwo.setTextureSize(64, 32);
      ReedTwo.mirror = true;
      setRotation(ReedTwo, -0.2617994F, -2.356194F, 0F);
      ReedThree = new ModelRenderer(this, 0, 0);
      ReedThree.addBox(-1F, -4F, -1F, 2, 30, 2);
      ReedThree.setRotationPoint(0F, 0F, 1F);
      ReedThree.setTextureSize(64, 32);
      ReedThree.mirror = true;
      setRotation(ReedThree, -0.2617994F, 2.356194F, 0F);
      TorchOne = new ModelRenderer(this, 8, 0);
      TorchOne.addBox(-1F, -14F, -1F, 2, 10, 2);
      TorchOne.setRotationPoint(0F, 0F, 1F);
      TorchOne.setTextureSize(64, 32);
      TorchOne.mirror = true;
      setRotation(TorchOne, -0.2617994F, 0F, 0F);
      TorchTwo = new ModelRenderer(this, 8, 0);
      TorchTwo.addBox(-1F, -14F, -1F, 2, 10, 2);
      TorchTwo.setRotationPoint(0F, 0F, 1F);
      TorchTwo.setTextureSize(64, 32);
      TorchTwo.mirror = true;
      setRotation(TorchTwo, -0.2617994F, -2.373648F, 0F);
      TorchThree = new ModelRenderer(this, 8, 0);
      TorchThree.addBox(-1F, -14F, -1F, 2, 10, 2);
      TorchThree.setRotationPoint(0F, 0F, 1F);
      TorchThree.setTextureSize(64, 32);
      TorchThree.mirror = true;
      setRotation(TorchThree, -0.2617994F, 2.356194F, 0F);
      Binding = new ModelRenderer(this, 16, 0);
      Binding.addBox(-2F, -1F, -2F, 4, 2, 4);
      Binding.setRotationPoint(0F, 0F, 1F);
      Binding.setTextureSize(64, 32);
      Binding.mirror = true;
      setRotation(Binding, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    ReedOne.render(f5);
    ReedTwo.render(f5);
    ReedThree.render(f5);
    TorchOne.render(f5);
    TorchTwo.render(f5);
    TorchThree.render(f5);
    Binding.render(f5);
  }
  
  public void renderModel(float f){
	  ReedOne.render(f);
	  ReedTwo.render(f);
	  ReedThree.render(f);
	  TorchOne.render(f);
	  TorchTwo.render(f);
	  TorchThree.render(f);
	  Binding.render(f);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
