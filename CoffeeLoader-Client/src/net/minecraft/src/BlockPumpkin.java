package net.minecraft.src;
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class BlockPumpkin extends Block
{

    protected BlockPumpkin(int i, int j, boolean flag)
    {
        super(i, Material.pumpkin);
        blockIndexInTexture = j;
        setTickOnLoad(true);
        field_4072_a = flag;
    }

    public int getBlockTextureFromSideAndMetadata(int i, int j)
    {
        if(i == 1)
        {
            return blockIndexInTexture;
        }
        if(i == 0)
        {
            return blockIndexInTexture;
        }
        int k = blockIndexInTexture + 1 + 16;
        if(field_4072_a)
        {
            k++;
        }
        if(j == 0 && i == 2)
        {
            return k;
        }
        if(j == 1 && i == 5)
        {
            return k;
        }
        if(j == 2 && i == 3)
        {
            return k;
        }
        if(j == 3 && i == 4)
        {
            return k;
        } else
        {
            return blockIndexInTexture + 16;
        }
    }

    public int getBlockTextureFromSide(int i)
    {
        if(i == 1)
        {
            return blockIndexInTexture;
        }
        if(i == 0)
        {
            return blockIndexInTexture;
        }
        if(i == 3)
        {
            return blockIndexInTexture + 1 + 16;
        } else
        {
            return blockIndexInTexture + 16;
        }
    }

    public void onBlockAdded(World world, int i, int j, int k)
    {
        super.onBlockAdded(world, i, j, k);
    }

    public boolean canPlaceBlockAt(World world, int i, int j, int k)
    {
        int l = world.getBlockId(i, j, k);
        return (l == 0 || Block.blocksList[l].blockMaterial.getIsLiquid()) && world.isBlockOpaqueCube(i, j - 1, k);
    }

    public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving)
    {
        int l = MathHelper.floor_double((double)((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
        world.setBlockMetadataWithNotify(i, j, k, l);
    }

    private boolean field_4072_a;
}
