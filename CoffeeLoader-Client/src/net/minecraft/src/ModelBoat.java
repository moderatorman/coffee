package net.minecraft.src;
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ModelBoat extends ModelBase
{

    public ModelBoat()
    {
        field_1287_a = new ModelRenderer[5];
        field_1287_a[0] = new ModelRenderer(0, 8);
        field_1287_a[1] = new ModelRenderer(0, 0);
        field_1287_a[2] = new ModelRenderer(0, 0);
        field_1287_a[3] = new ModelRenderer(0, 0);
        field_1287_a[4] = new ModelRenderer(0, 0);
        byte byte0 = 24;
        byte byte1 = 6;
        byte byte2 = 20;
        byte byte3 = 4;
        field_1287_a[0].addBox(-byte0 / 2, -byte2 / 2 + 2, -3F, byte0, byte2 - 4, 4, 0.0F);
        field_1287_a[0].setPosition(0.0F, 0 + byte3, 0.0F);
        field_1287_a[1].addBox(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        field_1287_a[1].setPosition(-byte0 / 2 + 1, 0 + byte3, 0.0F);
        field_1287_a[2].addBox(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        field_1287_a[2].setPosition(byte0 / 2 - 1, 0 + byte3, 0.0F);
        field_1287_a[3].addBox(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        field_1287_a[3].setPosition(0.0F, 0 + byte3, -byte2 / 2 + 1);
        field_1287_a[4].addBox(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        field_1287_a[4].setPosition(0.0F, 0 + byte3, byte2 / 2 - 1);
        field_1287_a[0].rotateAngleX = 1.570796F;
        field_1287_a[1].rotateAngleY = 4.712389F;
        field_1287_a[2].rotateAngleY = 1.570796F;
        field_1287_a[3].rotateAngleY = 3.141593F;
    }

    public void render(float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 5; i++)
        {
            field_1287_a[i].render(f5);
        }

    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRenderer field_1287_a[];
}
