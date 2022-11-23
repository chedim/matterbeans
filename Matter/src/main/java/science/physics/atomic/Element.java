package science.physics.atomic;

import language.Named;

import java.util.Collection;

public enum Element {
    Hydrogen("H", 1, 1, 1.0080f, 0.00009899f, 14.01f, 20.28f, 14.304f, 2.20f, 1400f),
    Helium("He", 18, 1, 4.0026f, 0.0001785f,  Float.MIN_VALUE, 4.22f, 5.193f, Float.MIN_VALUE, 0.008f),
    Lithium("Li", 1, 2, 6.94f, 0.534f, 453.69f, 1560f, 3.582f, 0.98f, 20f),
    Beryllium("Be", 2, 2, 9.0122f, 1.85f, 1560f, 2742f, 1.825f, 1.57f, 2.8f),
    Boron("B", 13, 2, 10.81f, 2.34f, 2349f, 4200f, 1.026f, 2.04f, 10f),
    Carbon("C", 14, 2, 12.011f, 2.267f, 4000f, 4300f, 0.709f, 2.55f, 200f),
    Nitrogen("N", 15, 2, 14.007f, 0.0012506f, 63.15f, 77.36f, 1.04f, 3.04f, 19f),
    Oxygen("O", 16, 2, 15.999f, 0.001429f, 54.36f, 90.20f, 0.918f, 3.44f, 461000f),
    Fluorine("F", 17, 2, 18.998f, 0.001696f, 53.53f, 85.03f, 0.824f, 3.98f, 585f),
    Neon("Ne", 18, 2, 20.180f, 0.0009002f, 24.56f, 27.07f, 1.03f, Float.MIN_VALUE, 0.005f),
    Sodium("Na", 1, 3, 22.990f, 0.968f, 370.87f, 1156f, 1.228f, 0.93f, 23600f),
    Magnesium("Mg", 2, 3, 24.305f, 1.738f, 923f, 1363f, 1.023f, 1.31f, 23300f),
    Aluminium("Al", 13, 3, 26.982f, 2.70f, 933.47f, 2792f, 0.897f, 1.61f, 82300),
    Silicon("Si", 14, 3, 28.085f, 2.3290f, 1687f, 3538f, 0.705f, 1.9f, 282000),
    Phosphorus("P", 15, 3, 30.974f, 1.823f, 313.30f, 550f, 0.769f, 2.19f, 1050f),
    Sulfur("S", 16, 3, 32.06f, 2.04f, 388.36f, 717.87f, 0.71f, 2.58f, 350f),
    Chlorine("Cl", 17, 3, 35.45f, 0.0032f, 171.6f, 239.11f, 0.479f, 3.16f, 145f),
    Argon("Ar", 18, 3, 39.95f, 0.001784f, 83.80f, 87.30f, 0.52f, Float.MIN_VALUE, 3.5f),
    Potassium("K", 1, 4, 39.098f, 0.89f, 336.53f, 1032f, 0.757f, 0.82f, 20900f),
    Calcium("Ca", 2, 4, 40.078f, 1.55f, 1115f, 1757f, 0.647f, 1.00f, 41500f),
    Scandium("Sc", 3, 4, 44.956f, 2.985f, 1814f, 3109f, 0.568f, 1.36f, 22f),
    Titanium("Ti", 4, 4, 47.867f, 4.506f, 1941f, 3560f, 0.523f, 1.54f, 5650f),
    Vanadium("V", 5, 4, 50.942f, 6.11f, 2183f, 3680f, 0.489f, 1.63f, 120f),
    Chromium("Cr", 6, 4, 51.996f, 7.15f, 2180f, 2944f, 0.449f, 1.66f, 102f),
    Manganese("Mn", 7, 4, 54.938f, 7.21f, 1519f, 2334f, 0.479f, 1.55f, 950f),
    Iron("Fe", 8, 4, 55.845f, 7.874f, 1811f, 3134f, 0.449f, 1.83f, 56300f),
    Cobalt("Co", 9, 4, 58.933f, 8.90f, 1768f, 3200f, 0.421f, 1.88f, 25f),
    Nickel("Ni", 10, 4, 58.693f, 8.908f, 1728f, 3186f, 0.444f, 1.91f, 84f),
    Copper("Cu", 11, 4, 63.546f, 8.96f, 1357.77f, 2835f, 0.385f, 1.90f, 60f),
    Zinc("Zn", 12, 4, 65.38f, 7.14f, 692.88f, 1180f, 0.388f, 1.65f, 70f),
    Gallium("Ga", 13, 4, 69.723f, 5.91f, 302.9146f, 2673f, 0.371f, 1.81f, 19f),
    Germanium("Ge", 14, 4, 72.630f, 5.323f, 1211.40f, 3106f, 0.32f, 2.01f, 1.5f),
    Arsenic("As", 15, 4, 74.922f, 5.727f, 1090f, 887f, 0.329f, 2.18f, 1.8f),
    Selenium("Se", 16, 4, 78.971f, 4.81f,  453f, 958f, 0.321f, 2.55f, 0.05f),
    Bromine("Br", 17, 4, 79.904f, 3.1028f, 265.8f, 332f, 0.474f, 2.96f, 2.4f),
    Krypton("Kr", 18, 4, 83.798f, 0.003749f, 115.79f, 119.93f, 0.248f, 3.00f, 1e-4f),
    Rubidium("Rb", 1, 5, 85.468f, 1.532f, 312.46f, 961f, 0.363f, 0.82f, 90f),
    Strontium("Sr", 2, 5, 87.62f, 2.64f, 1050f, 1655f, 0.301f, 0.95f, 370f),
    Yttrium("Y", 3, 5, 88.906f, 4.472f, 1799f, 3609f, 0.298f, 1.22f, 33f),
    Zirconium("Zr", 4, 5, 91.224f, 6.52f, 2128f, 4682f, 0.278f, 1.33f, 165f),
    Niobium("Nb", 5, 5, 92.906f, 8.57f, 2750f, 5017f, 0.265f, 1.6f, 20f),
    Molybdenum("Mo", 6, 5, 95.95f, 10.28f, 2896f, 4912f, 0.251f, 2.16f, 1.2f),
    Technetium("Tc", 7, 5, 97f, 11f, 2430f, 4538f, Float.MIN_VALUE, 1.9f, 3e-9f),
    Ruthenium("Ru", 8, 5, 101.07f, 12.45f, 2607f, 4423f, 0.238f, 2.2f, 0.001f),
    Rhodium("Rh", 9, 5, 102.91f, 12.41f, 2237f, 3968f, 0.243f, 2.28f, 0.001f),
    Palladium("Pd", 10, 5, 106.42f, 12.023f, 1828.05f, 3236f, 0.244f, 2.20f, 0.015f),
    Silver("Ag", 11, 5, 107.87f, 10.49f, 1234.93f, 2435f, 0.235f, 1.93f, 0.075f),
    Cadmium("Cd", 12, 5, 112.41f, 8.65f, 594.22f, 1040f, 0.232f, 1.69f, 0.159f),
    Indium("In", 13, 5, 114.82f, 7.31f, 429.75f, 2345f, 0.233f, 1.78f, 0.25f),
    Tin("Sn", 14, 5, 118.71f, 7.265f, 505.08f, 2875f, 0.228f, 1.96f, 2.3f),
    Antimony("Sb", 15, 5, 121.76f, 6.697f, 903.78f, 1860f, 0.207f, 2.05f, 0.2f),
    Tellurium("Te", 16, 5, 127.60f, 6.24f, 722.66f, 1261f, 0.202f, 2.1f, 0.001f),
    Iodine("I", 17, 5, 126.9f, 4.933f, 386.85f, 457.4f, 0.214f, 2.66f, 0.45f),
    Xenon("Xe", 18, 5, 131.29f, 0.005894f, 161.4f, 165.03f, 0.158f, 2.60f, 3e-5f),
    Caesium("Cs", 1, 6, 132.29f, 1.93f, 301.59f, 944f, 0.242f, 0.79f, 3f),
    Barium("Ba", 2, 6, 137.33f, 3.51f, 1000f, 2170f, 0.204f, 0.89f, 425f),
    Lanthanum("La", -1, 6, 138.91f, 6.162f, 1193f, 3737f, 0.195f, 1.1f, 39f),
    Cerium("Ce", -1, 6, 140.12f, 6.77f, 1068f, 3716f, 0.192f, 1.12f, 66.5f),
    Praseodymium("Pr", -1, 6, 140.91f, 6.77f, 1208f, 3793f, 0.193f, 1.13f, 9.2f),
    Neodymium("Nd", -1, 6, 144.24f, 7.01f, 1297f, 3347f, 0.19f, 1.14f, 41.5f),
    Promethium("Pm", -1, 6, 145f, 7.26f, 1315f, 3273f, Float.MIN_VALUE, 1.13f, 2e-19f),
    Samarium("Sm", -1, 6, 150.36f, 7.52f, 1345f, 2067f, 0.197f, 1.17f, 7.05f),
    Europium("Eu", -1, 6, 151.96f, 5.244f, 1099f, 1802f, 0.182f, 1.2f, 2f),
    Gadolinium("Gd", -1, 6, 157.25f, 7.90f, 1585f, 2546f, 0.236f, 1.2f, 6.2f),
    Terbium("Tb", -1, 6, 158.93f, 8.23f, 1629f, 3503f, 0.182f, 1.2f, 1.2f),
    Dysprosium("Dy", -1, 6, 162.5f, 8.54f, 1680f, 2840f, 0.17f, 1.22f, 5.2f),
    Holmium("Ho", -1, 6, 164.93f, 8.79f, 1734f, 2993f, 0.165f, 1.23f, 1.3f),
    Erbium("Er", -1, 6, 167.26f, 9.066f, 1802f, 3141f, 0.168f, 1.24f, 3.5f),
    Thulium("Tm", -1, 6, 168.93f, 9.32f, 1818f, 2223f, 0.16f, 1.25f, 0.52f),
    Ytterbium("Yb", -1, 6, 173.05f, 6.9f, 1097f, 1469f, 0.155f, 1.1f, 3.2f),
    Lutetium("Lu", 3, 6, 174.97f, 9.841f, 1925f, 3675f, 0.154f, 1.27f, 0.8f),
    Hafnium("Hf", 4, 6, 178.49f, 13.31f, 2506f, 4876f, 0.144f, 1.3f, 3f),
    Tantalum("Ta", 5, 6, 180.95f, 16.69f, 3290f, 5731f, 0.14f, 1.5f, 2f),
    Tungsten("W", 6, 6, 183.84f, 19.25f, 3695f, 5828f, 0.132f, 2.36f, 1.3f),
    Rhenium("Re", 7, 6, 186.21f, 21.02f, 3459f, 5869f, 0.137f, 1.9f, 7e-4f),
    Osmium("Os", 8, 6, 190.23f, 22.59f, 3306f, 5285f, 0.13f, 2.2f, 0.002f),
    Iridium("Ir", 9, 6, 192.22f, 22.56f, 2719f, 4701f, 0.131f, 2.2f, 0.001f),
    Platinum("Pt", 10, 6, 195.08f, 21.45f, 2041.4f, 4098f, 0.133f, 2.28f, 0.005f),
    Gold("Au", 11, 6, 196.97f, 19.3f, 1337.33f, 3129f, 0.129f, 2.54f, 0.004f),
    Mercury("Hg", 12, 6, 200.59f, 13.534f, 234.43f, 629.88f, 0.14f, 2.00f, 0.085f),
    Thallium("Tl", 13, 6, 204.38f, 11.85f, 577f, 1746f, 0.129f, 1.62f, 0.85f),
    Lead("Pb", 14, 6, 208.98f, 9.78f, 544.7f, 1837f, 0.122f, 2.02f, 0.009f),
    Bismuth("Bi", 15, 6, 208.98f, 9.78f, 544.7f, 1837f, 0.122f, 2.02f, 0.009f),
    Polonium("Po", 16, 6, 209f, 9.196f, 527f, 1235f, Float.MIN_VALUE, 2.0f, 2e-10f),
    Astatine("At", 17, 6, 210f, 8.935f, 575f, 610f, Float.MIN_VALUE, 2.2f, 3e-20f),
    Radon("Rn", 18, 6, 222f, 0.00973f, 202f, 211.3f, 0.094f, 2.2f, 4e-13f),
    Francium("Fr", 1, 7, 223f, 2.48f, 281f, 890f, Float.MIN_VALUE, 0.8f, 1e-18f),
    Radium("Ra", 2, 7, 226f, 5.5f, 973f, 2010f, 0.094f, 0.9f, 9e-7f),
    Actinium("Ac", -1, 7, 227f, 10f, 1323f, 3471f, 0.12f, 1.1f, 5.5e-10f),
    Thorium("Th", -1, 7, 232.04f, 11.7f, 2115f, 5061f, 0.113f, 1.3f, 9.6f),
    Protactinium("Pa", -1, 7, 231.04f, 15.37f, 1841f, 4300f, Float.MIN_VALUE, 1.5f, 1.4e-6f),
    Uranium("U", -1, 7, 238.03f, 19.1f, 1405.3f, 4404f, 0.116f, 1.38f, 2.7f),
    Neptunium("Np", -1, 7, 237f, 20.45f, 917f, 4273f, Float.MIN_VALUE, 1.36f, 3e-12f),
    Plutonium("Pu", -1, 7, 244f, 19.85f, 912.5f, 3501f, Float.MIN_VALUE, 1.28f, 3e-11f),
    Americium("Am", -1, 7, 243f, 12f, 1449f, 2880f, Float.MIN_VALUE, 1.13f, 0),
    Curium("Cm", -1, 7, 247f, 13.51f, 1613f, 3383f, Float.MIN_VALUE, 1.28f, 0),
    Berkelium("Bk", -1, 7, 247f, 14.78f, 1259f, 2900f, Float.MIN_VALUE, 1.3f, 0),
    Californium("Cf", -1, 7, 251f, 15.1f, 1173f, 1743f, Float.MIN_VALUE, 1.3f, 0),
    Ensteinium("Es", -1, 7, 252f, 8.84f, 1133f, 1269f, Float.MIN_VALUE, 1.3f, 0),
    Fermium("Fm", -1, 7, 257f, 9.7f, 1125f, Float.MIN_VALUE, Float.MIN_VALUE, 1.3f, 0),
    Mendelevium("Md", -1, 7, 258f, 10.3f, 1100f, Float.MIN_VALUE, Float.MIN_VALUE, 1.3f, 0),
    Nobelium("No", -1, 7, 259f, 9.9f, 1100f, Float.MIN_VALUE, Float.MIN_VALUE, 1.3f, 0),
    Lawrencium("Lr", 3, 7, 266f, 14.4f, 1900f, Float.MIN_VALUE, Float.MIN_VALUE, 1.3f, 0),
    Rutherfordium("Rf", 4, 7, 267f, 17f, 2400f, 5800f, Float.MIN_VALUE, Float.MIN_VALUE, 0),
    Dubnium("Db", 5, 7, 268f, 21.6f, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, 0),
    Seaborgium("Sg", 6, 7, 269f, 23.5f, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, 0),
    Bohrium("Bh", 7, 7, 270f, 26.5f, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, 0),
    Hassium("Hs", 8, 7, 269f, 28f, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, 0),
    Meitnerium("Mt", 9, 7, 278f, 27.5f, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, 0),
    Darmstadtium("Ds", 10, 7, 281f, 26.5f, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, 0),
    Roentgenium("Rg", 11, 7, 282f, 23.5f, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, 0),
    Copernicium("Cn", 12, 7, 285f, 14f, 283f, 340f, Float.MIN_VALUE, Float.MIN_VALUE, 0),
    Nihonium("Nh", 13, 7, 286f, 16f, 700f, 1400f, Float.MIN_VALUE, Float.MIN_VALUE, 0),
    Flerovium("Fl", 14, 7, 289f, 11.4f, 284f, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, 0),
    Moscovium("Mc", 15, 7, 290f, 13.5f, 700f, 1400f, Float.MIN_VALUE, Float.MIN_VALUE, 0),
    Livermorium("Fl", 16, 7, 293f, 12.9f, 700f, 1100f, Float.MIN_VALUE, Float.MIN_VALUE, 0),
    Tennessine("Ts", 17, 7, 294f, 7.2f, 700f, 883f, Float.MIN_VALUE, Float.MIN_VALUE, 0),
    Oganesson("Og", 18, 7, 294f, 7.2f, 700f, 883f, Float.MIN_VALUE, Float.MIN_VALUE, 0),
    ;

    private final String symbol;
    private final int group;
    private final int period;
    private final float atomicWeight;
    private final float density;
    private final float meltingPoint;
    private final float boilingPoint;
    private final float heatCapacity;
    private final float electroNegativity;
    private final float abundance;

    Element(String symbol, int group, int period, float atomicWeight, float density, float meltingPoint, float boilingPoint, float heatCapacity, float electroNegativity, float abundance) {
        this.symbol = symbol;
        this.group = group;
        this.period = period;
        this.atomicWeight = atomicWeight;
        this.density = density;
        this.meltingPoint = meltingPoint;
        this.boilingPoint = boilingPoint;
        this.heatCapacity = heatCapacity;
        this.electroNegativity = electroNegativity;
        this.abundance = abundance;
    }

    public String symbol() {
        return symbol;
    }

    public int group() {
        return group;
    }

    public int period() {
        return period;
    }

    public float atomicWeight() {
        return atomicWeight;
    }

    public float density() {
        return density;
    }

    public float meltingPoint() {
        return meltingPoint;
    }

    public float boilingPoint() {
        return boilingPoint;
    }

    public float heatCapacity() {
        return heatCapacity;
    }

    public float electroNegativity() {
        return electroNegativity;
    }

    public float abundance() {
        return abundance;
    }
}
