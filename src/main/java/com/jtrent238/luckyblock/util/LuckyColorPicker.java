package com.jtrent238.luckyblock.util;

import com.jtrent238.luckyblock.BlockLoader;
import net.minecraft.block.Block;

import java.util.Random;

public class LuckyColorPicker {

    private static Random rand = new Random();

    public static Block lucky_block;

    public Block pickColor(){
        int luckyColorPickerMin = 0;
        int luckyColorPickerMax = 14;


        for (int rl = 0; rl < 25; rl++) {

            int luckyColorPicker = rand.nextInt((luckyColorPickerMax - luckyColorPickerMin) + 1) + luckyColorPickerMin;


            switch (luckyColorPicker) {

                case 0:
                    lucky_block = BlockLoader.BlockLucky;
                    break;
                case 1:
                    lucky_block = BlockLoader.BlockLucky_Black;
                    break;
                case 2:
                    lucky_block = BlockLoader.BlockLucky_Brown;
                    break;
                case 3:
                    lucky_block = BlockLoader.BlockLucky_Cyan;
                    break;
                case 4:
                    lucky_block = BlockLoader.BlockLucky_Green;
                    break;
                case 5:
                    lucky_block = BlockLoader.BlockLucky_Grey;
                    break;
                case 6:
                    lucky_block = BlockLoader.BlockLucky_Lime;
                    break;
                case 7:
                    lucky_block = BlockLoader.BlockLucky_LightBlue;
                    break;
                case 8:
                    lucky_block = BlockLoader.BlockLucky_Magenta;
                    break;
                case 9:
                    lucky_block = BlockLoader.BlockLucky_Orange;
                    break;
                case 10:
                    lucky_block = BlockLoader.BlockLucky_Pink;
                    break;
                case 11:
                    lucky_block = BlockLoader.BlockLucky_Purple;
                    break;
                case 12:
                    lucky_block = BlockLoader.BlockLucky_White;
                    break;
                case 13:
                    lucky_block = BlockLoader.BlockLucky_Blue;
                    break;
                case 14:
                    lucky_block = BlockLoader.BlockLucky_Red;
                    break;

                default:
                    break;
            }
        }
        return lucky_block;
    }


}
