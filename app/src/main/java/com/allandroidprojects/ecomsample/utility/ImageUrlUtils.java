package com.allandroidprojects.ecomsample.utility;

import java.util.ArrayList;

/**
 * Created by 06peng on 2015/6/24.
 */
public class ImageUrlUtils {
    static ArrayList<String> wishlistImageUri = new ArrayList<>();
    static ArrayList<String> cartListImageUri = new ArrayList<>();

    public static String[] getImageUrls() {
        String[] urls = new String[] {
                "https://static.pexels.com/photos/5854/sea-woman-legs-water-medium.jpg",
                "https://static.pexels.com/photos/6245/kitchen-cooking-interior-decor-medium.jpg",
                "https://static.pexels.com/photos/6770/light-road-lights-night-medium.jpg",
                "https://static.pexels.com/photos/6041/nature-grain-moving-cereal-medium.jpg",
                "https://static.pexels.com/photos/7116/mountains-water-trees-lake-medium.jpg",
                "https://static.pexels.com/photos/6601/food-plate-yellow-white-medium.jpg",
                "https://static.pexels.com/photos/6695/summer-sun-yellow-spring-medium.jpg",
                "https://static.pexels.com/photos/7117/mountains-night-clouds-lake-medium.jpg",
                "https://static.pexels.com/photos/7262/clouds-ocean-seagull-medium.jpg",
                "https://static.pexels.com/photos/5968/wood-nature-dark-forest-medium.jpg",
                "https://static.pexels.com/photos/6101/hands-woman-art-hand-medium.jpg",
                "https://static.pexels.com/photos/6571/pexels-photo-medium.jpeg",
                "https://static.pexels.com/photos/6740/food-sugar-lighting-milk-medium.jpg",
                "https://static.pexels.com/photos/5659/sky-sunset-clouds-field-medium.jpg",
                "https://static.pexels.com/photos/6945/sunset-summer-golden-hour-paul-filitchkin-medium.jpg",
                "https://static.pexels.com/photos/6151/animal-cute-fur-white-medium.jpg",
                "https://static.pexels.com/photos/5696/coffee-cup-water-glass-medium.jpg",
                "https://static.pexels.com/photos/6789/flowers-petals-gift-flower-medium.jpg",
                "https://static.pexels.com/photos/7202/summer-trees-sunlight-trail-medium.jpg",
                "https://static.pexels.com/photos/7147/night-clouds-summer-trees-medium.jpg",
                "https://static.pexels.com/photos/6342/woman-notebook-working-girl-medium.jpg",
                "https://static.pexels.com/photos/5998/sky-love-people-romantic-medium.jpg",
                "https://static.pexels.com/photos/6872/cold-snow-nature-weather-medium.jpg",
                "https://static.pexels.com/photos/7045/pexels-photo-medium.jpeg",
                "https://static.pexels.com/photos/6923/mountains-fog-green-beauty-medium.jpg",
                "https://static.pexels.com/photos/6946/summer-bicycle-letsride-paul-filitchkin-medium.jpg",
                "https://static.pexels.com/photos/5650/sky-clouds-field-blue-medium.jpg",
                "https://static.pexels.com/photos/6292/blue-pattern-texture-macro-medium.jpg",
                "https://static.pexels.com/photos/6080/grass-lawn-technology-tablet-medium.jpg",
                "https://static.pexels.com/photos/7124/clouds-trees-medium.jpg",
                "https://static.pexels.com/photos/5923/woman-girl-teenager-wine-medium.jpg",
                "https://static.pexels.com/photos/6133/food-polish-cooking-making-medium.jpg",
                "https://static.pexels.com/photos/6224/hands-people-woman-working-medium.jpg",
                "https://static.pexels.com/photos/6414/rucola-young-argula-sproutus-medium.jpg",
                "https://static.pexels.com/photos/6739/art-graffiti-abstract-vintage-medium.jpg",
                "https://static.pexels.com/photos/6703/city-train-metal-public-transportation-medium.jpg",
                "https://static.pexels.com/photos/6851/man-love-woman-kiss-medium.jpg",
                "https://static.pexels.com/photos/6225/black-scissors-medium.jpg",
                "https://static.pexels.com/photos/7185/night-clouds-trees-stars-medium.jpg",
                "https://static.pexels.com/photos/5847/fashion-woman-girl-jacket-medium.jpg",
                "https://static.pexels.com/photos/5542/vintage-railroad-tracks-bw-medium.jpg",
                "https://static.pexels.com/photos/5938/food-salad-healthy-lunch-medium.jpg",
                "https://static.pexels.com/photos/7234/water-clouds-ocean-splash-medium.jpg",
                "https://static.pexels.com/photos/6418/flowers-flower-roses-rose-medium.jpg",
                "https://static.pexels.com/photos/6436/spring-flower-hyacinth-medium.jpg",
                "https://static.pexels.com/photos/6351/smartphone-desk-laptop-technology-medium.jpg",
                "https://static.pexels.com/photos/5618/fish-fried-mint-pepper-medium.jpg",
                "https://static.pexels.com/photos/6874/landscape-nature-water-rocks-medium.jpg",
                "https://static.pexels.com/photos/6918/bridge-fog-san-francisco-lets-get-lost-medium.jpg",
                "https://static.pexels.com/photos/5658/light-sunset-red-flowers-medium.jpg",
                "https://static.pexels.com/photos/6111/smartphone-friends-internet-connection-medium.jpg",
                "https://static.pexels.com/photos/5670/wood-fashion-black-stylish-medium.jpg",
                "https://static.pexels.com/photos/5838/hands-woman-hand-typing-medium.jpg",
                "https://static.pexels.com/photos/7050/sky-clouds-skyline-blue-medium.jpg",
                "https://static.pexels.com/photos/6036/nature-forest-tree-bark-medium.jpg",
                "https://static.pexels.com/photos/5676/art-camera-photography-picture-medium.jpg",
                "https://static.pexels.com/photos/6688/beach-sand-blue-ocean-medium.jpg",
                "https://static.pexels.com/photos/6901/sunset-clouds-golden-hour-lets-get-lost-medium.jpg",
                "https://static.pexels.com/photos/7260/rocks-fire-camping-medium.jpg",
                "https://static.pexels.com/photos/5672/dog-cute-adorable-play-medium.jpg",
                "https://static.pexels.com/photos/7261/rocks-trees-hiking-trail-medium.jpg",
                "https://static.pexels.com/photos/6411/smartphone-girl-typing-phone-medium.jpg",
                "https://static.pexels.com/photos/6412/table-white-home-interior-medium.jpg",
                "https://static.pexels.com/photos/6184/technology-keyboard-desktop-book-medium.jpg",
                "https://static.pexels.com/photos/7295/controller-xbox-gaming-medium.jpg",
                "https://static.pexels.com/photos/6732/city-cars-traffic-lights-medium.jpg",
                "https://static.pexels.com/photos/7160/bird-trees-medium.jpg",
                "https://static.pexels.com/photos/6999/red-hand-summer-berries-medium.jpg",
                "https://static.pexels.com/photos/5787/flowers-meadow-spring-green-medium.jpg",
                "https://static.pexels.com/photos/7136/water-rocks-stream-leaves-medium.jpg",
                "https://static.pexels.com/photos/7291/building-historical-church-religion-medium.jpg",
                "https://static.pexels.com/photos/6696/road-nature-summer-forest-medium.jpg",
                "https://static.pexels.com/photos/7294/garden-medium.jpg",
                "https://static.pexels.com/photos/6948/flight-sky-art-clouds-medium.jpg",
                "https://static.pexels.com/photos/7299/africa-animals-zoo-zebras-medium.jpg",
                "https://static.pexels.com/photos/6345/dark-brown-milk-candy-medium.jpg",
                "https://static.pexels.com/photos/7288/animal-dog-pet-park-medium.jpg",
                "https://static.pexels.com/photos/5863/nature-plant-leaf-fruits-medium.jpg",
                "https://static.pexels.com/photos/6625/pexels-photo-medium.jpeg",
                "https://static.pexels.com/photos/6708/stairs-people-sitting-architecture-medium.jpg",
                "https://static.pexels.com/photos/6429/smartphone-technology-music-white-medium.jpg",
                "https://static.pexels.com/photos/6574/pexels-photo-medium.jpeg",
                "https://static.pexels.com/photos/7287/grass-lawn-meadow-medium.jpg",
                "https://static.pexels.com/photos/6100/man-hands-holidays-looking-medium.jpg",
                "https://static.pexels.com/photos/6100/man-hands-holidays-looking-medium.jpg",
                "https://static.pexels.com/photos/6877/dog-pet-fur-brown-medium.jpg",
                "https://static.pexels.com/photos/6790/light-road-nature-iphone-medium.jpg",
                "https://static.pexels.com/photos/7077/man-people-office-writing-medium.jpg",
                "https://static.pexels.com/photos/6889/light-mountains-sunrise-california-medium.jpg",
                "https://static.pexels.com/photos/7274/leaf-fall-foliage-medium.jpg",
                "https://static.pexels.com/photos/7285/flowers-garden-medium.jpg",
                "https://static.pexels.com/photos/6821/light-sky-beach-sand-medium.jpg",
                "https://static.pexels.com/photos/7297/animal-africa-giraffe-medium.jpg",
                "https://static.pexels.com/photos/6154/sea-sky-water-clouds-medium.jpg",
                "https://static.pexels.com/photos/7059/man-people-space-desk-medium.jpg",
                "https://static.pexels.com/photos/6666/coffee-cup-mug-apple-medium.jpg",
                "https://static.pexels.com/photos/5949/food-nature-autumn-nuts-medium.jpg",
                "https://static.pexels.com/photos/7064/man-notes-macbook-computer-medium.jpg",
                "https://static.pexels.com/photos/5743/beach-sand-legs-shoes-medium.jpg",
                "https://static.pexels.com/photos/6355/desk-laptop-working-technology-medium.jpg",
                "https://static.pexels.com/photos/5844/sea-water-boats-boat-medium.jpg",
                "https://static.pexels.com/photos/5541/city-night-building-house-medium.jpg",
                "https://static.pexels.com/photos/7017/food-peppers-kitchen-yum-medium.jpg",
                "https://static.pexels.com/photos/5725/grey-luxury-carpet-silver-medium.jpg",
                "https://static.pexels.com/photos/6932/italian-vintage-old-beautiful-medium.jpg",
                "https://static.pexels.com/photos/7093/coffee-desk-notes-workspace-medium.jpg",
        };
        return urls;
    }

    public static String[] getOffersUrls() {
        String[] urls = new String[]{
                "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//94/MTA-1485408/puppets-skateboard_puppets-skateboard---skateboard-black-and-natural--size-8-0-_full02.jpg",
                "https://d3b962r9eea4ib.cloudfront.net/fmjycv33/8/144927/6cee5218de1bf7020d2fd744c64c1b885bf2ca168208f2eea00e4deeaf2615bba/A",
                "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/medium//94/MTA-1486920/trekking_trekking-carrier-adventure-45-l-tas-gunung---yellow--arj023-_full02.jpg",
                "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//91/MTA-1549135/dhaulagiri_dhaulagiri-single-nest-include-ring-plus-webbing_full02.jpg",
                "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//108/MTA-0279998/nike_nike-646246-010-wmns-as-df-epic-run-capri-celana-lari-wanita_full01.jpg",
                "https://images.sportsdirect.com/images/products/62310640_l.jpg",
                "https://static.pexels.com/photos/213384/pexels-photo-213384-medium.jpeg",
                "https://static.pexels.com/photos/67442/pexels-photo-67442-medium.jpeg",
                "https://static.pexels.com/photos/159494/book-glasses-read-study-159494-medium.jpeg",
                "https://static.pexels.com/photos/1543/landscape-nature-man-person-medium.jpg",
                "https://static.pexels.com/photos/211048/pexels-photo-211048-medium.jpeg",
                "https://static.pexels.com/photos/2713/wall-home-deer-medium.jpg",
                "https://static.pexels.com/photos/177143/pexels-photo-177143-medium.jpeg",
                "https://static.pexels.com/photos/106936/pexels-photo-106936-medium.jpeg"
        };
        return urls;
    }

    public static String[] getHomeApplianceUrls() {
        String[] urls = new String[]{
                "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//86/MTA-1514902/suzuran_suzuran-slop-sandal-gunung-pria---black-yellow--mr1-_full02.jpg",
                "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/medium//86/MTA-1563422/m2000_m2000-led-flashlight-emergency-lamp-senter-multifungsi---coklat_full02.jpg",
                "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//619/gregory_gregory-zulu-30l_full08.jpg",
                "http://id-live-01.slatic.net/p/2/ht-baofeng-radio-bf-888s-uhf-bf888s-free-earset-handy-walkietalkie-2230-79227221-8fc99b56131c671133b2d31ae4d0d27f-zoom.jpg",
                "https://static.pexels.com/photos/111147/pexels-photo-111147-medium.jpeg",
                "https://static.pexels.com/photos/2713/wall-home-deer-medium.jpg",
                "https://static.pexels.com/photos/177143/pexels-photo-177143-medium.jpeg",
                "https://static.pexels.com/photos/106936/pexels-photo-106936-medium.jpeg",
                "https://static.pexels.com/photos/1778/numbers-time-watch-white-medium.jpg",
                "https://static.pexels.com/photos/189293/pexels-photo-189293-medium.jpeg",
                "https://static.pexels.com/photos/4703/inside-apartment-design-home-medium.jpg",
                "https://static.pexels.com/photos/133919/pexels-photo-133919-medium.jpeg",
                "https://static.pexels.com/photos/111147/pexels-photo-111147-medium.jpeg",
                "https://static.pexels.com/photos/2713/wall-home-deer-medium.jpg",
                "https://static.pexels.com/photos/177143/pexels-photo-177143-medium.jpeg",
                "https://static.pexels.com/photos/106936/pexels-photo-106936-medium.jpeg"
        };
        return urls;
    }

    public static String[] getElectronicsUrls() {
        String[] urls = new String[]{
                "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//93/MTA-1541757/honma_honma-golf-bag---navy--cb-2817-_full02.jpg",
                "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//98/MTA-1493855/green-club-golf_green-club-golf-iron-cover-set-with-zipper_full02.jpg",
                "https://www.newpages2u.com/images/150935006389ce11f821a6734d73891d67bcd74067.jpg",
                "https://www.halpennygolf.com/Images/Models/Original/25548.png",
                "https://static.pexels.com/photos/114907/pexels-photo-114907-medium.jpeg",
                "https://static.pexels.com/photos/185030/pexels-photo-185030-medium.jpeg",
                "https://static.pexels.com/photos/133579/pexels-photo-133579-medium.jpeg",
                "https://static.pexels.com/photos/51383/photo-camera-subject-photographer-51383-medium.jpeg",
                "https://static.pexels.com/photos/205926/pexels-photo-205926-medium.jpeg",
                "https://static.pexels.com/photos/2396/light-glass-lamp-idea-medium.jpg",
                "https://static.pexels.com/photos/1854/person-woman-hand-relaxing-medium.jpg",
                "https://static.pexels.com/photos/204611/pexels-photo-204611-medium.jpeg",
                "https://static.pexels.com/photos/214487/pexels-photo-214487-medium.jpeg",
                "https://static.pexels.com/photos/168575/pexels-photo-168575-medium.jpeg",
                "https://static.pexels.com/photos/213384/pexels-photo-213384-medium.jpeg",
                "https://static.pexels.com/photos/114907/pexels-photo-114907-medium.jpeg"
        };
        return urls;
    }

    public static String[] getLifeStyleUrls() {
        String[] urls = new String[]{
                "https://cdn.shopify.com/s/files/1/1213/2346/products/nike_sportswearwindrunner_jacket_whiteblack_1_large.jpg?v=1502439935",
                "http://www.idareyoutoeatit.com/media/catalog/product/cache/1/image/350x350/9df78eab33525d08d6e5fb8d27136e95/n/i/nike-black-heather-white-joggers-sportswear-advance-15-men-s.jpg",
                "http://www.thesneakerpoint.nl/Files/7/112000/112175/ProductPhotos/400x400/460961420.jpg",
                "https://imp.imagekit.io/catalog/product/n/i/nike_sportswear_windbreaker_back_lg.jpg",
                "https://newsneakernews-wpengine.netdna-ssl.com/wp-content/uploads/2014/03/nike-sportswear-spotlights-classic-air-max-releases-03-570x570.jpg",
                "https://www.theteamfactory.com/wp-content/uploads/2015/10/nike-divition-uniform.jpg",
                "https://hypb.imgix.net/image/2016/01/adidas-laceless-football-boot-soccer-001.jpg?fit=max&q=90&w=500&h=333&auto=compress%2Cformat",
                "http://www.billyboy.es/images/Billyboy/Ropa%20de%20hombre%20adidas%20Camisa%20Escocia%202016%20Local%20-%20es.192780.jpg",
                "http://images.footballfanatics.com/partners/ohiouniversity/Ohio_BleedGreen_F_A2.jpg",
                "https://cdn.shopify.com/s/files/1/1175/4346/products/authentic_helmet_-_XP_5296c119-0636-4518-ae3f-4acccd29c9d9_large.jpg?v=1469847747",
                "https://i.pinimg.com/564x/85/5e/66/855e66dee6d81f8ab34e8dc8f7dc6066.jpg",
                "http://media.eveden.com/Freya.2/1.1/a/650/910/FFFFFF/active/swim/ss14/thumbnail/ACTIVE-SWIM-BLACK-SOFT-SUIT-3182.jpg",
                "https://ae01.alicdn.com/kf/HTB1PO84OVXXXXXWaXXXq6xXFXXXR/HXBY-2017-Swimwear-Women-Full-Body-Arena-Plus-Size-One-Piece-Suits-Swimsuit-Competitive-Swimming-Sharkskin.jpg",
                "http://lunato.net/wp-content/uploads/2017/04/131491-magnini_7-600x400.jpg",
                "http://www.teluguone.com/tonecmsuserfiles/Best%20Diet%20Tips%20For%20Winter%20Season(1).jpg",
                "https://euimages.urbanoutfitters.com/is/image/UrbanOutfittersEU/0123433450762_060_b?$medium$&fit=constrain",
                "https://shop.r10s.jp/culture/cabinet/1607-pic25/ad-aj8528_3.jpg",
        };
        return urls;
    }

    public static String[] getBooksUrls() {
        String[] urls = new String[]{
                "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/medium//96/MTA-1555917/puink_puink-skateboard-ikan-series-peralatan-skate---brown_full02.jpg",
                "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/medium//97/MTA-1555918/puink_puink-skateboard-octopus-series-peralatan-skate---blue_full02.jpg",
                "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/medium//87/MTA-1556051/sex-toys_sex-toys-donuts-pivot-skateboard---black_full03.jpg",
                "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//92/MTA-1556047/sex-toys_sex-toys-candy-skateboard-bolts-baut-skate---multicolor--1-inch-_full03.jpg",
                "https://static.pexels.com/photos/38167/pexels-photo-38167-medium.jpeg",
                "https://static.pexels.com/photos/68562/pexels-photo-68562-medium.jpeg",
                "https://static.pexels.com/photos/34592/pexels-photo-medium.jpg",
                "https://static.pexels.com/photos/1579/hand-notes-holding-things-medium.jpg",
                "https://static.pexels.com/photos/26890/pexels-photo-26890-medium.jpg",
                "https://static.pexels.com/photos/67442/pexels-photo-67442-medium.jpeg",
                "https://static.pexels.com/photos/159494/book-glasses-read-study-159494-medium.jpeg",
                "https://static.pexels.com/photos/33283/stack-of-books-vintage-books-book-books-medium.jpg",
                "https://static.pexels.com/photos/205323/pexels-photo-205323-medium.png",
                "https://static.pexels.com/photos/38167/pexels-photo-38167-medium.jpeg",
                "https://static.pexels.com/photos/68562/pexels-photo-68562-medium.jpeg",
        };
        return urls;
    }

    // Methods for Wishlist
    public void addWishlistImageUri(String wishlistImageUri) {
        this.wishlistImageUri.add(0,wishlistImageUri);
    }

    public void removeWishlistImageUri(int position) {
        this.wishlistImageUri.remove(position);
    }

    public ArrayList<String> getWishlistImageUri(){ return this.wishlistImageUri; }

    // Methods for Cart
    public void addCartListImageUri(String wishlistImageUri) {
        this.cartListImageUri.add(0,wishlistImageUri);
    }

    public void removeCartListImageUri(int position) {
        this.cartListImageUri.remove(position);
    }

    public ArrayList<String> getCartListImageUri(){ return this.cartListImageUri; }
}
