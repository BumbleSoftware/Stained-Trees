package net.bumblesoftware.stainedtrees.world.gen;

import net.bumblesoftware.stainedtrees.world.feature.STPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;

public class STTreeGeneration {
    public static void generateBlackTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, STPlacedFeatures.BLACK_OAK_PLACED.getKey().get());
    }
    public static void generateBlueTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, STPlacedFeatures.BLUE_OAK_PLACED.getKey().get());
    }
    public static void generateBrownTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, STPlacedFeatures.BROWN_OAK_PLACED.getKey().get());
    }
    public static void generateCyanTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, STPlacedFeatures.CYAN_OAK_PLACED.getKey().get());
    }
    public static void generateGrayTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, STPlacedFeatures.GRAY_OAK_PLACED.getKey().get());
    }
    public static void generateLightBlueTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, STPlacedFeatures.LIGHT_BLUE_OAK_PLACED.getKey().get());
    }
    public static void generateLightGrayTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, STPlacedFeatures.LIGHT_GRAY_OAK_PLACED.getKey().get());
    }public static void generateLimeTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, STPlacedFeatures.LIME_OAK_PLACED.getKey().get());
    }
    public static void generateMagentaTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, STPlacedFeatures.MAGENTA_OAK_PLACED.getKey().get());
    }
    public static void generateOrangeTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, STPlacedFeatures.ORANGE_OAK_PLACED.getKey().get());
    }
    public static void generatePinkTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, STPlacedFeatures.PINK_OAK_PLACED.getKey().get());
    }
    public static void generatePurpleTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, STPlacedFeatures.PURPLE_OAK_PLACED.getKey().get());
    }
    public static void generateRedTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, STPlacedFeatures.RED_OAK_PLACED.getKey().get());
    }
    public static void generateWhiteTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, STPlacedFeatures.WHITE_OAK_PLACED.getKey().get());
    }
    public static void generateYellowTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, STPlacedFeatures.YELLOW_OAK_PLACED.getKey().get());
    }
}
