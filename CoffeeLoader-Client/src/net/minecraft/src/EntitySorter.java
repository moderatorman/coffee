package net.minecraft.src;
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Comparator;

public class EntitySorter
    implements Comparator
{

    public EntitySorter(Entity entity)
    {
        field_1594_a = entity;
    }

    public int func_1063_a(WorldRenderer worldrenderer, WorldRenderer worldrenderer1)
    {
        return worldrenderer.func_1202_a(field_1594_a) >= worldrenderer1.func_1202_a(field_1594_a) ? 1 : -1;
    }

    public int compare(Object obj, Object obj1)
    {
        return func_1063_a((WorldRenderer)obj, (WorldRenderer)obj1);
    }

    private Entity field_1594_a;
}
