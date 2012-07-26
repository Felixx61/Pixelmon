// Date: 18/07/2012 4:39:21 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package pixelmon.Pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelGloom extends ModelBase
{
  //fields
    ModelRenderer LEFTLEG;
    ModelRenderer RIGHTLEG;
    ModelRenderer LeftFoot;
    ModelRenderer LeftLeg;
    ModelRenderer RightFoot;
    ModelRenderer RightLeg;
    ModelRenderer BODYBASE;
    ModelRenderer Eye1;
    ModelRenderer Eye2;
    ModelRenderer Eye3;
    ModelRenderer Eye4;
    ModelRenderer Eye5;
    ModelRenderer Eye6;
    ModelRenderer Eye7;
    ModelRenderer Eye8;
    ModelRenderer RightBulb1;
    ModelRenderer RightBulb2;
    ModelRenderer Rightbulb3;
    ModelRenderer RightBulb4;
    ModelRenderer RightBulb5;
    ModelRenderer Hair1;
    ModelRenderer Hair2;
    ModelRenderer Hair3;
    ModelRenderer Hair4;
    ModelRenderer BackBulb;
    ModelRenderer BackBulb2;
    ModelRenderer MidBulb;
    ModelRenderer BackBulb1;
    ModelRenderer TopBulb;
    ModelRenderer FrontBulb;
    ModelRenderer FrontBulb1;
    ModelRenderer FrontBulb2;
    ModelRenderer FrontBulb3;
    ModelRenderer FrontBulb4;
    ModelRenderer FrontBulb5;
    ModelRenderer FrontBulb6;
    ModelRenderer BackBulb3;
    ModelRenderer BackBulb4;
    ModelRenderer BackBulb5;
    ModelRenderer Body1;
    ModelRenderer Body2;
    ModelRenderer Body3;
    ModelRenderer Body4;
    ModelRenderer LeftArm;
    ModelRenderer RightArm;
    ModelRenderer Mouth;
    ModelRenderer MidBulb2;
    ModelRenderer LeftBulb2;
    ModelRenderer Leftbulb3;
    ModelRenderer LeftBulb4;
    ModelRenderer LeftBulb5;
    ModelRenderer LeftBulb6;
    ModelRenderer LeftBulb7;
    
  
    public ModelGloom()
    {
      textureWidth = 64;
      textureHeight = 127;
      
      LEFTLEG = new ModelRenderer(this, "LEFTLEG");
      LEFTLEG.setRotationPoint(-3F, 20F, 0F);
      setRotation(LEFTLEG, 0F, 0F, 0F);
      LEFTLEG.mirror = true;
        ModelRenderer LeftFoot = new ModelRenderer(this, 0, 0);
        LeftFoot.addBox(-1.5F, 2F, -4.5F, 3, 2, 6);
        LeftFoot.setRotationPoint(0F, 0F, 0F);
        LeftFoot.setTextureSize(64, 127);
        LeftFoot.mirror = true;
        setRotation(LeftFoot, 0F, 0.296706F, 0F);
        ModelRenderer LeftLeg = new ModelRenderer(this, 0, 0);
        LeftLeg.addBox(-1F, 0F, -1F, 2, 4, 2);
        LeftLeg.setRotationPoint(0F, 0F, 0F);
        LeftLeg.setTextureSize(64, 127);
        LeftLeg.mirror = true;
        setRotation(LeftLeg, 0F, 0.296706F, 0F);
        
        LEFTLEG.addChild(LeftFoot);
        LEFTLEG.addChild(LeftLeg);
        
      RIGHTLEG = new ModelRenderer(this, "RIGHTLEG");
      RIGHTLEG.setRotationPoint(3F, 20F, 0F);
      setRotation(RIGHTLEG, 0F, 0F, 0F);
      RIGHTLEG.mirror = true;
        ModelRenderer RightFoot = new ModelRenderer(this, 0, 0);
        RightFoot.addBox(-1.5F, 2F, -4.5F, 3, 2, 6);
        RightFoot.setRotationPoint(0F, 0F, 0F);
        RightFoot.setTextureSize(64, 127);
        RightFoot.mirror = true;
        setRotation(RightFoot, 0F, -0.296706F, 0F);
        ModelRenderer RightLeg = new ModelRenderer(this, 0, 0);
        RightLeg.addBox(-1F, 0F, -1F, 2, 4, 2);
        RightLeg.setRotationPoint(0F, 0F, 0F);
        RightLeg.setTextureSize(64, 127);
        RightLeg.mirror = true;
        setRotation(RightLeg, 0F, -0.296706F, 0F);
        
        RIGHTLEG.addChild(RightFoot);
        RIGHTLEG.addChild(RightLeg);
        
      BODYBASE = new ModelRenderer(this, "BODYBASE");
      BODYBASE.setRotationPoint(0F, 15F, 0F);
      setRotation(BODYBASE, 0F, 0F, 0F);
      BODYBASE.mirror = true;
        ModelRenderer Rightbulb3 = new ModelRenderer(this, 0, 57);
        Rightbulb3.addBox(-5F, 0F, -5F, 6, 3, 5);
        Rightbulb3.setRotationPoint(-2.5F, -8.5F, 2.5F);
        Rightbulb3.setTextureSize(64, 127);
        Rightbulb3.mirror = true;
        setRotation(Rightbulb3, 0F, 0F, 0F);
        ModelRenderer RightBulb1 = new ModelRenderer(this, 0, 46);
        RightBulb1.addBox(-5F, 0F, -5F, 5, 4, 6);
        RightBulb1.setRotationPoint(-2F, -9F, 2F);
        RightBulb1.setTextureSize(64, 127);
        RightBulb1.mirror = true;
        setRotation(RightBulb1, 0F, 0F, 0F);
        ModelRenderer Leftbulb3 = new ModelRenderer(this, 0, 46);
        Leftbulb3.addBox(-5F, 0F, -5F, 3, 4, 4);
        Leftbulb3.setRotationPoint(8F, -10F, 3F);
        Leftbulb3.setTextureSize(64, 127);
        Leftbulb3.mirror = true;
        setRotation(Leftbulb3, 0F, 0F, 0F);
        ModelRenderer BackBulb2 = new ModelRenderer(this, 0, 46);
        BackBulb2.addBox(-5F, 0F, -5F, 7, 3, 4);
        BackBulb2.setRotationPoint(1.5F, -8.5F, 7.5F);
        BackBulb2.setTextureSize(64, 127);
        BackBulb2.mirror = true;
        setRotation(BackBulb2, 0F, 0F, 0F);
        ModelRenderer MidBulb = new ModelRenderer(this, 0, 46);
        MidBulb.addBox(-5F, 0F, -5F, 3, 3, 4);
        MidBulb.setRotationPoint(3F, -9F, 3F);
        MidBulb.setTextureSize(64, 127);
        MidBulb.mirror = true;
        setRotation(MidBulb, 0F, 0F, 0F);
        ModelRenderer BackBulb1 = new ModelRenderer(this, 0, 46);
        BackBulb1.addBox(-5F, 0F, -5F, 6, 4, 5);
        BackBulb1.setRotationPoint(2F, -9F, 7F);
        BackBulb1.setTextureSize(64, 127);
        BackBulb1.mirror = true;
        setRotation(BackBulb1, 0F, 0F, 0F);
        ModelRenderer BackBulb = new ModelRenderer(this, 0, 46);
        BackBulb.addBox(-5F, 0F, -5F, 5, 5, 4);
        BackBulb.setRotationPoint(2.5F, -9.5F, 7.5F);
        BackBulb.setTextureSize(64, 127);
        BackBulb.mirror = true;
        setRotation(BackBulb, 0F, 0F, 0F);
        ModelRenderer LeftBulb2 = new ModelRenderer(this, 0, 46);
        LeftBulb2.addBox(-5F, 0F, -5F, 3, 2, 8);
        LeftBulb2.setRotationPoint(8F, -8F, 1F);
        LeftBulb2.setTextureSize(64, 127);
        LeftBulb2.mirror = true;
        setRotation(LeftBulb2, 0F, 0F, 0F);
        ModelRenderer  TopBulb = new ModelRenderer(this, 52, 0);
        TopBulb.addBox(-5F, 0F, -5F, 3, 2, 3);
        TopBulb.setRotationPoint(3.5F, -9.5F, 3.5F);
        TopBulb.setTextureSize(64, 127);
        TopBulb.mirror = true;
        setRotation(TopBulb, 0F, 0F, 0F);
        ModelRenderer  Eye8 = new ModelRenderer(this, 13, 39);
        Eye8.addBox(0F, 0F, 0F, 1, 1, 1);
        Eye8.setRotationPoint(2.9F, -2.5F, -5.6F);
        Eye8.setTextureSize(64, 127);
        Eye8.mirror = true;
        setRotation(Eye8, 0F, 0F, 0F);
        ModelRenderer  Eye7 = new ModelRenderer(this, 13, 39);
        Eye7.addBox(-1F, 0F, 0F, 1, 1, 1);
        Eye7.setRotationPoint(3F, -2.5F, -5.6F);
        Eye7.setTextureSize(64, 127);
        Eye7.mirror = true;
        setRotation(Eye7, 0F, 0F, 0.1115358F);
        ModelRenderer  Eye6 = new ModelRenderer(this, 13, 39);
        Eye6.addBox(-1F, 0F, 0F, 1, 1, 1);
        Eye6.setRotationPoint(2.5F, -2.5F, -5.6F);
        Eye6.setTextureSize(64, 127);
        Eye6.mirror = true;
        setRotation(Eye6, 0F, 0F, 0.2602503F);
        ModelRenderer   Eye5 = new ModelRenderer(this, 13, 39);
        Eye5.addBox(-0.9F, 0F, 0F, 1, 1, 1);
        Eye5.setRotationPoint(1.833333F, -2.6F, -5.6F);
        Eye5.setTextureSize(64, 127);
        Eye5.mirror = true;
        setRotation(Eye5, 0F, 0F, 0.7063936F);
        ModelRenderer   Eye4 = new ModelRenderer(this, 13, 39);
        Eye4.addBox(0F, 0F, 0F, 1, 1, 1);
        Eye4.setRotationPoint(-2.5F, -2.5F, -5.6F);
        Eye4.setTextureSize(64, 127);
        Eye4.mirror = true;
        setRotation(Eye4, 0F, 0F, -0.260246F);
        ModelRenderer  Eye3 = new ModelRenderer(this, 13, 39);
        Eye3.addBox(0F, 0F, 0F, 1, 1, 1);
        Eye3.setRotationPoint(-3F, -2.5F, -5.6F);
        Eye3.setTextureSize(64, 127);
        Eye3.mirror = true;
        setRotation(Eye3, 0F, 0F, -0.111544F);
        ModelRenderer Eye2 = new ModelRenderer(this, 13, 39);
        Eye2.addBox(-1F, 0F, 0F, 1, 1, 1);
        Eye2.setRotationPoint(-2.9F, -2.5F, -5.6F);
        Eye2.setTextureSize(64, 127);
        Eye2.mirror = true;
        setRotation(Eye2, 0F, 0F, 0F);
        ModelRenderer  Eye1 = new ModelRenderer(this, 13, 39);
        Eye1.addBox(-0.1F, 0F, 0F, 1, 1, 1);
        Eye1.setRotationPoint(-1.8F, -2.6F, -5.6F);
        Eye1.setTextureSize(64, 127);
        Eye1.mirror = true;
        setRotation(Eye1, 0F, 0F, -0.7063871F);
        ModelRenderer Hair3 = new ModelRenderer(this, 0, 119);
        Hair3.addBox(0F, 0F, 0F, 9, 8, 0);
        Hair3.setRotationPoint(5F, -12F, 2F);
        Hair3.setTextureSize(64, 127);
        Hair3.mirror = true;
        setRotation(Hair3, 0F, -0.2974289F, 0F);
        ModelRenderer  Hair4 = new ModelRenderer(this, 0, 108);
        Hair4.addBox(0F, 0F, 0F, 7, 8, 0);
        Hair4.setRotationPoint(4F, -6F, -2.9F);
        Hair4.setTextureSize(64, 127);
        Hair4.mirror = true;
        setRotation(Hair4, 0F, 0.1858931F, 0F);
        ModelRenderer  Hair2 = new ModelRenderer(this, 0, 96);
        Hair2.addBox(0F, 0F, 0F, 7, 8, 0);
        Hair2.setRotationPoint(-8F, -6F, -6F);
        Hair2.setTextureSize(64, 127);
        Hair2.mirror = true;
        setRotation(Hair2, 0F, 0.0743572F, 0F);
        ModelRenderer  Hair1 = new ModelRenderer(this, 0, 83);
        Hair1.addBox(-9F, 0F, 0F, 9, 9, 0);
        Hair1.setRotationPoint(-6F, -8F, 2F);
        Hair1.setTextureSize(64, 127);
        Hair1.mirror = true;
        setRotation(Hair1, 0F, 0.2974289F, 0F);
        ModelRenderer  Body3 = new ModelRenderer(this, 0, 0);
        Body3.addBox(-5F, 0F, -5F, 9, 11, 9);
        Body3.setRotationPoint(0.5F, -5.5F, 0.5F);
        Body3.setTextureSize(64, 127);
        Body3.mirror = true;
        setRotation(Body3, 0F, 0F, 0F);
        ModelRenderer Body4 = new ModelRenderer(this, 0, 19);
        Body4.addBox(-5F, 0F, -5F, 9, 9, 11);
        Body4.setRotationPoint(0.5F, -4.5F, -0.5F);
        Body4.setTextureSize(64, 127);
        Body4.mirror = true;
        setRotation(Body4, 0F, 0F, 0F);
        ModelRenderer Mouth = new ModelRenderer(this, 50, 5);
        Mouth.addBox(0F, 0F, 1F, 6, 1, 1);
        Mouth.setRotationPoint(-3F, 0F, -7F);
        Mouth.setTextureSize(64, 127);
        Mouth.mirror = true;
        setRotation(Mouth, 0F, 0F, 0F);
        ModelRenderer  RightArm = new ModelRenderer(this, 0, 0);
        RightArm.addBox(-1F, -1F, -1F, 2, 5, 2);
        RightArm.setRotationPoint(-5.5F, 2F, 0F);
        RightArm.setTextureSize(64, 127);
        RightArm.mirror = true;
        setRotation(RightArm, 0F, 0F, 1.308997F);
        ModelRenderer LeftArm = new ModelRenderer(this, 0, 0);
        LeftArm.addBox(-1F, -1F, -1F, 2, 5, 2);
        LeftArm.setRotationPoint(5.5F, 2F, 0F);
        LeftArm.setTextureSize(64, 127);
        LeftArm.mirror = true;
        setRotation(LeftArm, 0F, 0F, -1.308997F);
        ModelRenderer  Body2 = new ModelRenderer(this, 0, 0);
        Body2.addBox(-5F, 0F, -5F, 10, 10, 10);
        Body2.setRotationPoint(0F, -5F, 0F);
        Body2.setTextureSize(64, 127);
        Body2.mirror = true;
        setRotation(Body2, 0F, 0F, 0F);
        ModelRenderer  RightBulb2 = new ModelRenderer(this, 0, 46);
        RightBulb2.addBox(-5F, 0F, -5F, 4, 3, 7);
        RightBulb2.setRotationPoint(-1.5F, -8.5F, 1.5F);
        RightBulb2.setTextureSize(64, 127);
        RightBulb2.mirror = true;
        setRotation(RightBulb2, 0F, 0F, 0F);
        ModelRenderer   BackBulb3 = new ModelRenderer(this, 0, 46);
        BackBulb3.addBox(-5F, 0F, -5F, 8, 2, 3);
        BackBulb3.setRotationPoint(1F, -8F, 8F);
        BackBulb3.setTextureSize(64, 127);
        BackBulb3.mirror = true;
        setRotation(BackBulb3, 0F, 0F, 0F);
        ModelRenderer   FrontBulb = new ModelRenderer(this, 0, 46);
        FrontBulb.addBox(-5F, 0F, -5F, 6, 4, 5);
        FrontBulb.setRotationPoint(2F, -9F, -2F);
        FrontBulb.setTextureSize(64, 127);
        FrontBulb.mirror = true;
        setRotation(FrontBulb, 0F, 0F, 0F);
        ModelRenderer  BackBulb4 = new ModelRenderer(this, 0, 46);
        BackBulb4.addBox(-5F, 0F, -5F, 4, 4, 3);
        BackBulb4.setRotationPoint(3F, -10F, 8F);
        BackBulb4.setTextureSize(64, 127);
        BackBulb4.mirror = true;
        setRotation(BackBulb4, 0F, 0F, 0F);
        ModelRenderer   FrontBulb1 = new ModelRenderer(this, 31, 46);
        FrontBulb1.addBox(-5F, 0F, -5F, 5, 3, 6);
        FrontBulb1.setRotationPoint(2.5F, -8.5F, -2.5F);
        FrontBulb1.setTextureSize(64, 127);
        FrontBulb1.mirror = true;
        setRotation(FrontBulb1, 0F, 0F, 0F);
        ModelRenderer  FrontBulb2 = new ModelRenderer(this, 0, 46);
        FrontBulb2.addBox(-5F, 0F, -5F, 5, 5, 4);
        FrontBulb2.setRotationPoint(2.5F, -9.5F, -1.5F);
        FrontBulb2.setTextureSize(64, 127);
        FrontBulb2.mirror = true;
        setRotation(FrontBulb2, 0F, 0F, 0F);
        ModelRenderer   FrontBulb3 = new ModelRenderer(this, 0, 46);
        FrontBulb3.addBox(-5F, 0F, -5F, 4, 4, 3);
        FrontBulb3.setRotationPoint(3F, -10F, -1F);
        FrontBulb3.setTextureSize(64, 127);
        FrontBulb3.mirror = true;
        setRotation(FrontBulb3, 0F, 0F, 0F);
        ModelRenderer   RightBulb4 = new ModelRenderer(this, 0, 46);
        RightBulb4.addBox(-5F, 0F, -5F, 4, 5, 5);
        RightBulb4.setRotationPoint(-1.5F, -9.5F, 2.5F);
        RightBulb4.setTextureSize(64, 127);
        RightBulb4.mirror = true;
        setRotation(RightBulb4, 0F, 0F, 0F);
        ModelRenderer   RightBulb5 = new ModelRenderer(this, 0, 46);
        RightBulb5.addBox(-5F, 0F, -5F, 3, 4, 4);
        RightBulb5.setRotationPoint(-1F, -10F, 3F);
        RightBulb5.setTextureSize(64, 127);
        RightBulb5.mirror = true;
        setRotation(RightBulb5, 0F, 0F, 0F);
        ModelRenderer   FrontBulb4 = new ModelRenderer(this, 0, 46);
        FrontBulb4.addBox(-5F, 0F, -5F, 7, 3, 4);
        FrontBulb4.setRotationPoint(1.5F, -8.5F, -1.5F);
        FrontBulb4.setTextureSize(64, 127);
        FrontBulb4.mirror = true;
        setRotation(FrontBulb4, 0F, 0F, 0F);
        ModelRenderer   FrontBulb5 = new ModelRenderer(this, 0, 46);
        FrontBulb5.addBox(-5F, 0F, -5F, 3, 2, 8);
        FrontBulb5.setRotationPoint(-1F, -8F, 1F);
        FrontBulb5.setTextureSize(64, 127);
        FrontBulb5.mirror = true;
        setRotation(FrontBulb5, 0F, 0F, 0F);
        ModelRenderer    LeftBulb4 = new ModelRenderer(this, 0, 46);
        LeftBulb4.addBox(-5F, 0F, -5F, 4, 3, 7);
        LeftBulb4.setRotationPoint(7.5F, -8.5F, 1.5F);
        LeftBulb4.setTextureSize(64, 127);
        LeftBulb4.mirror = true;
        setRotation(LeftBulb4, 0F, 0F, 0F);
        ModelRenderer    BackBulb5 = new ModelRenderer(this, 30, 57);
        BackBulb5.addBox(-5F, 0F, -5F, 5, 3, 6);
        BackBulb5.setRotationPoint(2.5F, -8.5F, 6.5F);
        BackBulb5.setTextureSize(64, 127);
        BackBulb5.mirror = true;
        setRotation(BackBulb5, 0F, 0F, 0F);
        ModelRenderer    MidBulb2 = new ModelRenderer(this, 10, 48);
        MidBulb2.addBox(-5F, 0F, -5F, 4, 3, 5);
        MidBulb2.setRotationPoint(3.5F, -9F, 2.5F);
        MidBulb2.setTextureSize(64, 127);
        MidBulb2.mirror = true;
        setRotation(MidBulb2, 0F, 0F, 0F);
        ModelRenderer    LeftBulb5 = new ModelRenderer(this, 0, 46);
        LeftBulb5.addBox(-5F, 0F, -5F, 4, 5, 5);
        LeftBulb5.setRotationPoint(7.5F, -9.5F, 2.5F);
        LeftBulb5.setTextureSize(64, 127);
        LeftBulb5.mirror = true;
        setRotation(LeftBulb5, 0F, 0F, 0F);
        ModelRenderer     LeftBulb7 = new ModelRenderer(this, 0, 46);
        LeftBulb7.addBox(-5F, 0F, -5F, 5, 4, 6);
        LeftBulb7.setRotationPoint(7F, -9F, 2F);
        LeftBulb7.setTextureSize(64, 127);
        LeftBulb7.mirror = true;
        setRotation(LeftBulb7, 0F, 0F, 0F);
        ModelRenderer   LeftBulb6 = new ModelRenderer(this, 30, 68);
        LeftBulb6.addBox(-5F, 0F, -5F, 6, 3, 5);
        LeftBulb6.setRotationPoint(6.5F, -8.5F, 2.5F);
        LeftBulb6.setTextureSize(64, 127);
        LeftBulb6.mirror = true;
        setRotation(LeftBulb6, 0F, 0F, 0F);
        ModelRenderer     Body1 = new ModelRenderer(this, 0, 0);
        Body1.addBox(-5F, 0F, -5F, 11, 9, 9);
        Body1.setRotationPoint(-0.5F, -4.5F, 0.5F);
        Body1.setTextureSize(64, 127);
        Body1.mirror = true;
        setRotation(Body1, 0F, 0F, 0F);
        ModelRenderer   FrontBulb6 = new ModelRenderer(this, 0, 46);
        FrontBulb6.addBox(-5F, 0F, -5F, 8, 2, 3);
        FrontBulb6.setRotationPoint(1F, -8F, -1F);
        FrontBulb6.setTextureSize(64, 127);
        FrontBulb6.mirror = true;
        setRotation(FrontBulb6, 0F, 0F, 0F);
        
        BODYBASE.addChild(Eye1);
        BODYBASE.addChild(Eye2);
        BODYBASE.addChild(Eye3);
        BODYBASE.addChild(Eye4);
        BODYBASE.addChild(Eye5);
        BODYBASE.addChild(Eye6);
        BODYBASE.addChild(Eye7);
        BODYBASE.addChild(Eye8);
        BODYBASE.addChild(RightBulb1);
        BODYBASE.addChild(RightBulb2);
        BODYBASE.addChild(Rightbulb3);
        BODYBASE.addChild(RightBulb4);
        BODYBASE.addChild(RightBulb5);
        BODYBASE.addChild(LeftBulb2);
        BODYBASE.addChild(Leftbulb3);
        BODYBASE.addChild(LeftBulb4);
        BODYBASE.addChild(LeftBulb5);
        BODYBASE.addChild(LeftBulb6);
        BODYBASE.addChild(LeftBulb7);
        BODYBASE.addChild(Hair1);
        BODYBASE.addChild(Hair2);
        BODYBASE.addChild(Hair3);
        BODYBASE.addChild(Hair4);
        BODYBASE.addChild(FrontBulb);
        BODYBASE.addChild(FrontBulb1);
        BODYBASE.addChild(FrontBulb2);
        BODYBASE.addChild(FrontBulb3);
        BODYBASE.addChild(FrontBulb4);
        BODYBASE.addChild(FrontBulb5);
        BODYBASE.addChild(FrontBulb6);
        BODYBASE.addChild(BackBulb);
        BODYBASE.addChild(BackBulb1);
        BODYBASE.addChild(BackBulb2);
        BODYBASE.addChild(BackBulb3);
        BODYBASE.addChild(BackBulb4);
        BODYBASE.addChild(BackBulb5);
        BODYBASE.addChild(MidBulb);
        BODYBASE.addChild(TopBulb);
        BODYBASE.addChild(Body1);
        BODYBASE.addChild(Body2);
        BODYBASE.addChild(Body3);
        BODYBASE.addChild(Body4);
        BODYBASE.addChild(Mouth);
        BODYBASE.addChild(RightArm);
        BODYBASE.addChild(LeftArm);
    }
    
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
      super.render(entity, f, f1, f2, f3, f4, f5);
      setRotationAngles(f, f1, f2, f3, f4, f5);
      LEFTLEG.render(f5);
      RIGHTLEG.render(f5);
      BODYBASE.render(f5);
    }
    
    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
      super.setRotationAngles(f, f1, f2, f3, f4, f5);
      BODYBASE.rotateAngleY = f3 / (270F / (float)Math.PI);
      BODYBASE.rotateAngleX = f4 / (270F / (float)Math.PI);
      RIGHTLEG.rotateAngleX = MathHelper.cos(f * 0.7F) * 1F * f1;
      LEFTLEG.rotateAngleX = MathHelper.cos(f * 0.7F + (float)Math.PI) *1F * f1;
      
    }

  }
