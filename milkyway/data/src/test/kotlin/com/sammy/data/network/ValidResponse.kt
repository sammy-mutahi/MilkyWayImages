package com.sammy.data.network

val validDToResponse = """
   {
      collection: {
         version: "1.0",
         href: "http://images-api.nasa.gov/search?q=milky%20way&amp;media_type=image&amp;year_start=2017&amp;year_end=2017",
         items: [
            {
               href: "https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e001362/collection.json",
               data: [
                  {
                  album: [
                     "Test"
                  ],
                  center: "GSFC",
                  title: "A monster in the Milky Way",
                  keywords: [
                     "A monster in the Milky Way"
                  ],
                  location: "Greenbelt, MD",
                  nasa_id: "GSFC_20171208_Archive_e001362",
                  date_created: "2017-12-08T00:00:00Z",
                  description: "This image shows the star-studded center of the Milky Way towards the constellation of Sagittarius. The crowded center of our galaxy contains numerous complex and mysterious objects that are usually hidden at optical wavelengths by clouds of dust but many are visible here in these infrared observations from Hubble.",
                  media_type: "image"
               }
               ],
               links: [
                  {
                     href: "https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e001362/GSFC_20171208_Archive_e001362~thumb.jpg",
                     rel: "preview",
                     render: "image"
                  }
               ]
            },
         ],
         metadata: {
            total_hits: 71
         }
      }
   }
""".trimIndent()

val validSearchResult = """
    {
    nasaId: "GSFC_20171208_Archive_e001362",
    title: "A monster in the Milky Way",
    center: "GSFC",
    dateCreated: "2017-12-08T00:00:00Z",
    imagePath: "https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e001362/GSFC_20171208_Archive_e001362~thumb.jpg",
    description: "This image shows the star-studded center of the Milky Way towards the constellation of Sagittarius. The crowded center of our galaxy contains numerous complex and mysterious objects that are usually hidden at optical wavelengths by clouds of dust — but many are visible here in these infrared observations from Hubble.  However, the most famous cosmic object in this image still remains invisible: the monster at our galaxy’s heart called Sagittarius A*. Astronomers have observed stars spinning around this supermassive black hole (located right in the center of the image), and the black hole consuming clouds of dust as it affects its environment with its enormous gravitational pull.  Infrared observations can pierce through thick obscuring material to reveal information that is usually hidden to the optical observer. This is the best infrared image of this region ever taken with Hubble, and uses infrared archive data from Hubble’s Wide Field Camera 3, taken in September 2011.     Credit: NASA, ESA, and G. Brammer &lt;b&gt;&lt;a href="http://www.nasa.gov/audience/formedia/features/MP_Photo_Guidelines.html" rel="nofollow"&gt;NASA image use policy.&lt;/a&gt;&lt;/b&gt;  &lt;b&gt;&lt;a href="http://www.nasa.gov/centers/goddard/home/index.html" rel="nofollow"&gt;NASA Goddard Space Flight Center&lt;/a&gt;&lt;/b&gt; enables NASA’s mission through four scientific endeavors: Earth Science, Heliophysics, Solar System Exploration, and Astrophysics. Goddard plays a leading role in NASA’s accomplishments by contributing compelling scientific knowledge to advance the Agency’s mission.  &lt;b&gt;Follow us on &lt;a href="http://twitter.com/NASA_GoddardPix" rel="nofollow"&gt;Twitter&lt;/a&gt;&lt;/b&gt;  &lt;b&gt;Like us on &lt;a href="http://www.facebook.com/pages/Greenbelt-MD/NASA-Goddard/395013845897?ref=tsd" rel="nofollow"&gt;Facebook&lt;/a&gt;&lt;/b&gt;  &lt;b&gt;Find us on &lt;a href="http://instagram.com/nasagoddard?vm=grid" rel="nofollow"&gt;Instagram&lt;/a&gt;&lt;/b&gt;"
    }
""".trimIndent()