package com.jtrent238.luckyblock.entity.group;

import com.jtrent238.luckyblock.entity.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.util.Random;

public class EntityGroupHorde {

    private static Random rand = new Random();

    public static class LuckyHorde {

        private static Random rand = new Random();

        public static void spawnHorde(World world, EntityPlayer player) {

            int luckyColorPickerMin = 0;
            int luckyColorPickerMax = 14;

            int luckyPosmin = 5;
            int luckyPosmax = 25;

            for (int rl = 0; rl < 25; rl++) {

                int luckyColorPicker = rand.nextInt((luckyColorPickerMax - luckyColorPickerMin) + 1) + luckyColorPickerMin;


                switch (luckyColorPicker) {

                    case 0:


                        for (int l = 0; l < 5; l++) {

                            int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
                            int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;

                            EntityLivingLuckyBlock livingLuckyBlock = new EntityLivingLuckyBlock(world);

                            livingLuckyBlock.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                            world.spawnEntityInWorld(livingLuckyBlock);
                        }

                        break;

                    case 1:


                        for (int l = 0; l < 5; l++) {

                            int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
                            int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;

                            EntityLivingLuckyBlock_Red livingLuckyBlockRed = new EntityLivingLuckyBlock_Red(world);

                            livingLuckyBlockRed.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                            world.spawnEntityInWorld(livingLuckyBlockRed);
                        }

                        break;

                    case 2:


                        for (int l = 0; l < 5; l++) {

                            int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
                            int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;

                            EntityLivingLuckyBlock_Green livingLuckyBlockGreen = new EntityLivingLuckyBlock_Green(world);

                            livingLuckyBlockGreen.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                            world.spawnEntityInWorld(livingLuckyBlockGreen);
                        }

                        break;

                    case 3:


                        for (int l = 0; l < 5; l++) {

                            int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
                            int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;

                            EntityLivingLuckyBlock_White livingLuckyBlockWhite = new EntityLivingLuckyBlock_White(world);

                            livingLuckyBlockWhite.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                            world.spawnEntityInWorld(livingLuckyBlockWhite);
                        }

                        break;

                    case 4:


                        for (int l = 0; l < 5; l++) {

                            int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
                            int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;

                            EntityLivingLuckyBlock_Orange livingLuckyBlockOrange = new EntityLivingLuckyBlock_Orange(world);

                            livingLuckyBlockOrange.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                            world.spawnEntityInWorld(livingLuckyBlockOrange);
                        }

                        break;

                    case 5:


                        for (int l = 0; l < 5; l++) {

                            int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
                            int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;

                            EntityLivingLuckyBlock_Magenta livingLuckyBlockMagenta = new EntityLivingLuckyBlock_Magenta(world);

                            livingLuckyBlockMagenta.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                            world.spawnEntityInWorld(livingLuckyBlockMagenta);
                        }

                        break;

                    case 6:


                        for (int l = 0; l < 5; l++) {

                            int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
                            int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;

                            EntityLivingLuckyBlock_LightBlue livingLuckyBlockLightBlue = new EntityLivingLuckyBlock_LightBlue(world);

                            livingLuckyBlockLightBlue.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                            world.spawnEntityInWorld(livingLuckyBlockLightBlue);
                        }

                        break;

                    case 7:


                        for (int l = 0; l < 5; l++) {

                            int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
                            int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;

                            EntityLivingLuckyBlock_Lime livingLuckyBlockLime = new EntityLivingLuckyBlock_Lime(world);

                            livingLuckyBlockLime.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                            world.spawnEntityInWorld(livingLuckyBlockLime);
                        }

                        break;

                    case 8:


                        for (int l = 0; l < 5; l++) {

                            int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
                            int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;

                            EntityLivingLuckyBlock_Pink livingLuckyBlockPink = new EntityLivingLuckyBlock_Pink(world);

                            livingLuckyBlockPink.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                            world.spawnEntityInWorld(livingLuckyBlockPink);
                        }

                        break;

                    case 9:


                        for (int l = 0; l < 5; l++) {

                            int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
                            int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;

                            EntityLivingLuckyBlock_Grey livingLuckyBlockGrey = new EntityLivingLuckyBlock_Grey(world);

                            livingLuckyBlockGrey.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                            world.spawnEntityInWorld(livingLuckyBlockGrey);
                        }

                        break;

                    case 10:


                        for (int l = 0; l < 5; l++) {

                            int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
                            int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;

                            EntityLivingLuckyBlock_Cyan livingLuckyBlockCyan = new EntityLivingLuckyBlock_Cyan(world);

                            livingLuckyBlockCyan.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                            world.spawnEntityInWorld(livingLuckyBlockCyan);
                        }

                        break;

                    case 11:


                        for (int l = 0; l < 5; l++) {

                            int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
                            int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;

                            EntityLivingLuckyBlock_Purple livingLuckyBlockPurple = new EntityLivingLuckyBlock_Purple(world);

                            livingLuckyBlockPurple.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                            world.spawnEntityInWorld(livingLuckyBlockPurple);
                        }

                        break;

                    case 12:


                        for (int l = 0; l < 5; l++) {

                            int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
                            int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;

                            EntityLivingLuckyBlock_Blue livingLuckyBlockBlue = new EntityLivingLuckyBlock_Blue(world);

                            livingLuckyBlockBlue.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                            world.spawnEntityInWorld(livingLuckyBlockBlue);
                        }

                        break;

                    case 13:


                        for (int l = 0; l < 5; l++) {

                            int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
                            int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;

                            EntityLivingLuckyBlock_Brown livingLuckyBlockBrown = new EntityLivingLuckyBlock_Brown(world);

                            livingLuckyBlockBrown.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                            world.spawnEntityInWorld(livingLuckyBlockBrown);
                        }

                        break;

                    case 14:


                        for (int l = 0; l < 5; l++) {

                            int randPosX = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;
                            int randPosY = rand.nextInt((luckyPosmax - luckyPosmin) + 1) + luckyPosmin;

                            EntityLivingLuckyBlock_Black livingLuckyBlockBlack = new EntityLivingLuckyBlock_Black(world);

                            livingLuckyBlockBlack.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                            world.spawnEntityInWorld(livingLuckyBlockBlack);
                        }

                        break;

                    default:
                        break;
                }
            }
        }

    }

    public static class ZombieHorde {

        public static void spawnHorde(World world, EntityPlayer player) {
            EntityZombie theEntity = new EntityZombie(world);
                for (int z = 0; z < 25; z++) {

                    int min = 5;
                    int max = 25;
                    int randPosX = rand.nextInt((max - min) + 1) + min;
                    int randPosY = rand.nextInt((max - min) + 1) + min;

                    theEntity.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                    world.spawnEntityInWorld(theEntity);
        }
    }

}

    public static class SkeletonHorde {

        public static void spawnHorde(World world, EntityPlayer player) {

            EntitySkeleton theEntity = new EntitySkeleton(world);

            for (int z = 0; z < 25; z++) {

                int min = 5;
                int max = 25;
                int randPosX = rand.nextInt((max - min) + 1) + min;
                int randPosY = rand.nextInt((max - min) + 1) + min;

                theEntity.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                world.spawnEntityInWorld(theEntity);
            }
        }

    }

    public static class SlimeHorde {

        public static void spawnHorde(World world, EntityPlayer player) {

            EntitySlime theEntity = new EntitySlime(world);

            for (int z = 0; z < 25; z++) {

                int min = 5;
                int max = 25;
                int randPosX = rand.nextInt((max - min) + 1) + min;
                int randPosY = rand.nextInt((max - min) + 1) + min;

                theEntity.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                world.spawnEntityInWorld(theEntity);
            }
        }

    }

    public static class BlazeHorde {

        public static void spawnHorde(World world, EntityPlayer player) {

            EntityBlaze theEntity = new EntityBlaze(world);

            for (int z = 0; z < 25; z++) {

                int min = 5;
                int max = 25;
                int randPosX = rand.nextInt((max - min) + 1) + min;
                int randPosY = rand.nextInt((max - min) + 1) + min;

                theEntity.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                world.spawnEntityInWorld(theEntity);
            }
        }

    }

    public static class SpiderHorde {

        public static void spawnHorde(World world, EntityPlayer player) {

            EntitySpider theEntity = new EntitySpider(world);

            for (int z = 0; z < 25; z++) {

                int min = 5;
                int max = 25;
                int randPosX = rand.nextInt((max - min) + 1) + min;
                int randPosY = rand.nextInt((max - min) + 1) + min;

                theEntity.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                world.spawnEntityInWorld(theEntity);
            }
        }

    }

    public static class CaveSpiderHorde {

        public static void spawnHorde(World world, EntityPlayer player) {

            EntityCaveSpider theEntity = new EntityCaveSpider(world);

            for (int z = 0; z < 25; z++) {

                int min = 5;
                int max = 25;
                int randPosX = rand.nextInt((max - min) + 1) + min;
                int randPosY = rand.nextInt((max - min) + 1) + min;

                theEntity.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                world.spawnEntityInWorld(theEntity);
            }
        }

    }

    public static class CreeperHorde {

        public static void spawnHorde(World world, EntityPlayer player) {

            EntityCreeper theEntity = new EntityCreeper(world);
            for (int h = 0; h < 25; h++) {

                int min = 5;
                int max = 25;
                int randPosX = rand.nextInt((max - min) + 1) + min;
                int randPosY = rand.nextInt((max - min) + 1) + min;


                theEntity.setPosition(player.posX + randPosX, player.posY + 5, player.posZ + randPosY); //These are the coordinates where he will appear
                world.spawnEntityInWorld(theEntity);
            }
        }
    }
}
