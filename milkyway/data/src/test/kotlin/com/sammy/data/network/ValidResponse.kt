package com.sammy.data

val validResponse = """
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
                      media_type: "image",
                      description: "This image shows the star-studded center of the Milky Way towards the constellation of Sagittarius. The crowded center of our galaxy contains numerous complex and mysterious objects that are usually hidden at optical wavelengths by clouds of dust — but many are visible here in these infrared observations from Hubble.  However, the most famous cosmic object in this image still remains invisible: the monster at our galaxy’s heart called Sagittarius A*. Astronomers have observed stars spinning around this supermassive black hole (located right in the center of the image), and the black hole consuming clouds of dust as it affects its environment with its enormous gravitational pull.  Infrared observations can pierce through thick obscuring material to reveal information that is usually hidden to the optical observer. This is the best infrared image of this region ever taken with Hubble, and uses infrared archive data from Hubble’s Wide Field Camera 3, taken in September 2011.     Credit: NASA, ESA, and G. Brammer &lt;b&gt;&lt;a href="http://www.nasa.gov/audience/formedia/features/MP_Photo_Guidelines.html" rel="nofollow"&gt;NASA image use policy.&lt;/a&gt;&lt;/b&gt;  &lt;b&gt;&lt;a href="http://www.nasa.gov/centers/goddard/home/index.html" rel="nofollow"&gt;NASA Goddard Space Flight Center&lt;/a&gt;&lt;/b&gt; enables NASA’s mission through four scientific endeavors: Earth Science, Heliophysics, Solar System Exploration, and Astrophysics. Goddard plays a leading role in NASA’s accomplishments by contributing compelling scientific knowledge to advance the Agency’s mission.  &lt;b&gt;Follow us on &lt;a href="http://twitter.com/NASA_GoddardPix" rel="nofollow"&gt;Twitter&lt;/a&gt;&lt;/b&gt;  &lt;b&gt;Like us on &lt;a href="http://www.facebook.com/pages/Greenbelt-MD/NASA-Goddard/395013845897?ref=tsd" rel="nofollow"&gt;Facebook&lt;/a&gt;&lt;/b&gt;  &lt;b&gt;Find us on &lt;a href="http://instagram.com/nasagoddard?vm=grid" rel="nofollow"&gt;Instagram&lt;/a&gt;&lt;/b&gt;"
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
             {
                href: "https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e000261/collection.json",
                data: [
                   {
                      album: [
                         "Test"
                      ],
                      center: "GSFC",
                      title: "Astronomers Discover Dizzying Spin of the Milky Way Galaxy’s “Halo”",
                      keywords: [
                         "Astronomers Discover Dizzying Spin of the Milky Way Galaxy’s “Halo”",
                         "galactichalo"
                      ],
                      location: "Greenbelt, MD",
                      nasa_id: "GSFC_20171208_Archive_e000261",
                      date_created: "2017-12-08T00:00:00Z",
                      media_type: "image",
                      description: "Our Milky Way galaxy and its small companions are surrounded by a giant halo of million-degree gas (seen in blue in this artists' rendition) that is only visible to X-ray telescopes in space. University of Michigan astronomers discovered that this massive hot halo spins in the same direction as the Milky Way disk and at a comparable speed.  Read more: &lt;a href="http://go.nasa.gov/29VgLdK" rel="nofollow"&gt;go.nasa.gov/29VgLdK&lt;/a&gt;  Credit: NASA/CXC/M.Weiss/Ohio State/A Gupta et al  &lt;b&gt;&lt;a href="http://www.nasa.gov/audience/formedia/features/MP_Photo_Guidelines.html" rel="nofollow"&gt;NASA image use policy.&lt;/a&gt;&lt;/b&gt;  &lt;b&gt;&lt;a href="http://www.nasa.gov/centers/goddard/home/index.html" rel="nofollow"&gt;NASA Goddard Space Flight Center&lt;/a&gt;&lt;/b&gt; enables NASA’s mission through four scientific endeavors: Earth Science, Heliophysics, Solar System Exploration, and Astrophysics. Goddard plays a leading role in NASA’s accomplishments by contributing compelling scientific knowledge to advance the Agency’s mission.  &lt;b&gt;Follow us on &lt;a href="http://twitter.com/NASAGoddardPix" rel="nofollow"&gt;Twitter&lt;/a&gt;&lt;/b&gt;  &lt;b&gt;Like us on &lt;a href="http://www.facebook.com/pages/Greenbelt-MD/NASA-Goddard/395013845897?ref=tsd" rel="nofollow"&gt;Facebook&lt;/a&gt;&lt;/b&gt;  &lt;b&gt;Find us on &lt;a href="http://instagrid.me/nasagoddard/?vm=grid" rel="nofollow"&gt;Instagram&lt;/a&gt;&lt;/b&gt;      "
                   }
                ],
                links: [
                   {
                      href: "https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e000261/GSFC_20171208_Archive_e000261~thumb.jpg",
                      rel: "preview",
                      render: "image"
                   }
                ]
             },
             {
                href: "https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e000148/collection.json",
                data: [
                   {
                      album: [
                         "Test"
                      ],
                      center: "GSFC",
                      title: "Festive Nebulas Light Up Milky Way Galaxy Satellite",
                      keywords: [
                         "Festive Nebulas Light Up Milky Way Galaxy Satellite"
                      ],
                      location: "Greenbelt, MD",
                      nasa_id: "GSFC_20171208_Archive_e000148",
                      date_created: "2017-12-08T00:00:00Z",
                      media_type: "image",
                      description: "NASA’s Hubble Space Telescope captured two festive-looking nebulas, situated so as to appear as one. They reside in the Small Magellanic Cloud, a dwarf galaxy that is a satellite of our Milky Way galaxy. Intense radiation from the brilliant central stars is heating hydrogen in each of the nebulas, causing them to glow red.  The nebulas, together, are called NGC 248. They were discovered in 1834 by the astronomer Sir John Herschel. NGC 248 is about 60 light-years long and 20 light-years wide. It is among a number of glowing hydrogen nebulas in the dwarf satellite galaxy, which is located approximately 200,000 light-years away in the southern constellation Tucana.  The image is part of a study called Small Magellanic Cloud Investigation of Dust and Gas Evolution (SMIDGE). Astronomers are using Hubble to probe the Milky Way satellite to understand how dust is different in galaxies that have a far lower supply of heavy elements needed to create dust. The Small Magellanic Cloud has between a fifth and a tenth of the amount of heavy elements that the Milky Way does. Because it is so close, astronomers can study its dust in great detail, and learn about what dust was like earlier in the history of the universe. “It is important for understanding the history of our own galaxy, too,” explained the study’s principal investigator, Dr. Karin Sandstrom of the University of California, San Diego. Most of the star formation happened earlier in the universe, at a time where there was a much lower percentage of heavy elements than there is now. “Dust is a really critical part of how a galaxy works, how it forms stars,” said Sandstrom.  Credit: NASA, ESA, STScI, K. Sandstrom (University of California, San Diego), and the SMIDGE team  &lt;b&gt;&lt;a href="http://www.nasa.gov/audience/formedia/features/MP_Photo_Guidelines.html" rel="nofollow"&gt;NASA image use policy.&lt;/a&gt;&lt;/b&gt;  &lt;b&gt;&lt;a href="http://www.nasa.gov/centers/goddard/home/index.html" rel="nofollow"&gt;NASA Goddard Space Flight Center&lt;/a&gt;&lt;/b&gt; enables NASA’s mission through four scientific endeavors: Earth Science, Heliophysics, Solar System Exploration, and Astrophysics. Goddard plays a leading role in NASA’s accomplishments by contributing compelling scientific knowledge to advance the Agency’s mission.  &lt;b&gt;Follow us on &lt;a href="http://twitter.com/NASAGoddardPix" rel="nofollow"&gt;Twitter&lt;/a&gt;&lt;/b&gt;  &lt;b&gt;Like us on &lt;a href="http://www.facebook.com/pages/Greenbelt-MD/NASA-Goddard/395013845897?ref=tsd" rel="nofollow"&gt;Facebook&lt;/a&gt;&lt;/b&gt;  &lt;b&gt;Find us on &lt;a href="http://instagrid.me/nasagoddard/?vm=grid" rel="nofollow"&gt;Instagram&lt;/a&gt;&lt;/b&gt;   "
                   }
                ],
                links: [
                   {
                      href: "https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e000148/GSFC_20171208_Archive_e000148~thumb.jpg",
                      rel: "preview",
                      render: "image"
                   }
                ]
             },
             {
                href: "https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e001738/collection.json",
                data: [
                   {
                      album: [
                         "Test"
                      ],
                      center: "GSFC",
                      title: "NASA's Hubble Shows Milky Way is Destined for Head-On Collision",
                      keywords: [
                         "NASA's Hubble Shows Milky Way is Destined for Head-On Collision",
                         "sky",
                         "earth",
                         "nasa",
                         "galaxy",
                         "hubble",
                         "milkyway",
                         "hst",
                         "andromedagalaxy"
                      ],
                      location: "Greenbelt, MD",
                      nasa_id: "GSFC_20171208_Archive_e001738",
                      date_created: "2017-12-08T00:00:00Z",
                      media_type: "image",
                      description: "NASA image release Thursday, May 31, 2012  &lt;b&gt;To view a video from this Hubble release go to: &lt;a href="http://www.flickr.com/photos/gsfc/7309212940"&gt;www.flickr.com/photos/gsfc/7309212940&lt;/a&gt; &lt;/b&gt;  Caption: This illustration shows a stage in the predicted merger between our Milky Way galaxy and the neighboring Andromeda galaxy, as it will unfold over the next several billion years. In this image, representing Earth's night sky in 3.75 billion years, Andromeda (left) fills the field of view and begins to distort the Milky Way with tidal pull.   Credit: NASA; ESA; Z. Levay and R. van der Marel, STScI; T. Hallas; and A. Mellinger  To read more go to: &lt;a href="http://www.nasa.gov/mission_pages/hubble/science/milky-way-collide.html" rel="nofollow"&gt;www.nasa.gov/mission_pages/hubble/science/milky-way-colli...&lt;/a&gt;  &lt;b&gt;&lt;a href="http://www.nasa.gov/audience/formedia/features/MP_Photo_Guidelines.html" rel="nofollow"&gt;NASA image use policy.&lt;/a&gt;&lt;/b&gt;  &lt;b&gt;&lt;a href="http://www.nasa.gov/centers/goddard/home/index.html" rel="nofollow"&gt;NASA Goddard Space Flight Center&lt;/a&gt;&lt;/b&gt; enables NASA’s mission through four scientific endeavors: Earth Science, Heliophysics, Solar System Exploration, and Astrophysics. Goddard plays a leading role in NASA’s accomplishments by contributing compelling scientific knowledge to advance the Agency’s mission.  &lt;b&gt;Follow us on &lt;a href="http://twitter.com/NASA_GoddardPix" rel="nofollow"&gt;Twitter&lt;/a&gt;&lt;/b&gt;  &lt;b&gt;Like us on &lt;a href="http://www.facebook.com/pages/Greenbelt-MD/NASA-Goddard/395013845897?ref=tsd" rel="nofollow"&gt;Facebook&lt;/a&gt;&lt;/b&gt;  &lt;b&gt;Find us on &lt;a href="http://instagrid.me/nasagoddard/?vm=grid" rel="nofollow"&gt;Instagram&lt;/a&gt;&lt;/b&gt;"
                   }
                ],
                links: [
                   {
                      href: "https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e001738/GSFC_20171208_Archive_e001738~thumb.jpg",
                      rel: "preview",
                      render: "image"
                   }
                ]
             },
             {
                href: "https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e001981/collection.json",
                data: [
                   {
                      album: [
                         "Test"
                      ],
                      center: "GSFC",
                      title: "Fermi discovers giant gamma-ray bubbles in the Milky Way",
                      keywords: [
                         "Fermi discovers giant gamma-ray bubbles in the Milky Way",
                         "space",
                         "nasa",
                         "galaxy",
                         "gammaray",
                         "milkyway",
                         "goddardspaceflightcenter",
                         "fermitelescope"
                      ],
                      location: "Greenbelt, MD",
                      nasa_id: "GSFC_20171208_Archive_e001981",
                      date_created: "2017-12-08T00:00:00Z",
                      media_type: "image",
                      description: "NASA image release November 9, 2010  To view a video about this story go to: &lt;a href="http://www.flickr.com/photos/gsfc/5162413062"&gt;www.flickr.com/photos/gsfc/5162413062&lt;/a&gt;  Using data from NASA's Fermi Gamma-ray Space Telescope, scientists have recently discovered a gigantic, mysterious structure in our galaxy. This never-before-seen feature looks like a pair of bubbles extending above and below our galaxy's center.  But these enormous gamma-ray emitting lobes aren't immediately visible in the Fermi all-sky map. However, by processing the data, a group of scientists was able to bring these unexpected structures into sharp relief.  Each lobe is 25,000 light-years tall and the whole structure may be only a few million years old. Within the bubbles, extremely energetic electrons are interacting with lower-energy light to create gamma rays, but right now, no one knows the source of these electrons.  Are the bubbles remnants of a massive burst of star formation? Leftovers from an eruption by the supermassive black hole at our galaxy's center? Or or did these forces work in tandem to produce them? Scientists aren't sure yet, but the more they learn about this amazing structure, the better we'll understand the Milky Way.  To learn more go to: &lt;a href="http://www.nasa.gov/mission_pages/GLAST/news/new-structure.html" rel="nofollow"&gt;www.nasa.gov/mission_pages/GLAST/news/new-structure.html&lt;/a&gt;  &lt;b&gt;&lt;a href="http://www.nasa.gov/centers/goddard/home/index.html" rel="nofollow"&gt;NASA Goddard Space Flight Center&lt;/a&gt;&lt;/b&gt; enables NASA’s mission through four scientific endeavors: Earth Science, Heliophysics, Solar System Exploration, and Astrophysics. Goddard plays a leading role in NASA’s accomplishments by contributing compelling scientific knowledge to advance the Agency’s mission.  &lt;b&gt;Follow us on &lt;a href="http://twitter.com/NASA_GoddardPix" rel="nofollow"&gt;Twitter&lt;/a&gt;&lt;/b&gt;  &lt;b&gt;Join us on &lt;a href="http://www.facebook.com/pages/Greenbelt-MD/NASA-Goddard/395013845897?ref=tsd" rel="nofollow"&gt;Facebook&lt;/a&gt;&lt;/b&gt;  Credit: &lt;a href="http://svs.gsfc.nasa.gov/index.html" rel="nofollow"&gt;NASA/Goddard Space Flight Center Scientific Visualization Studio&lt;/a&gt;"
                   }
                ],
                links: [
                   {
                      href: "https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e001981/GSFC_20171208_Archive_e001981~thumb.jpg",
                      rel: "preview",
                      render: "image"
                   }
                ]
             },
             {
                href: "https://images-assets.nasa.gov/image/PIA20970/collection.json",
                data: [
                   {
                      center: "JPL",
                      title: "Pulsar Candidate in Andromeda",
                      keywords: [
                         "Galaxy Evolution Explorer GALEX,NuSTAR",
                         "Andromeda galaxy"
                      ],
                      nasa_id: "PIA20970",
                      date_created: "2017-03-23T15:50:41Z",
                      media_type: "image",
                      description_508: "NASA's NuSTAR has identified a candidate pulsar in Andromeda, the nearest large galaxy to the Milky Way. This likely pulsar is brighter at high energies than the Andromeda galaxy entire black hole population.",
                      secondary_creator: "NASA/JPL-Caltech/GSFC/JHU",
                      description: "NASA's Nuclear Spectroscope Telescope Array, or NuSTAR, has identified a candidate pulsar in Andromeda -- the nearest large galaxy to the Milky Way. This likely pulsar is brighter at high energies than the Andromeda galaxy's entire black hole population.  The inset image shows the pulsar candidate in blue, as seen in X-ray light by NuSTAR. The background image of Andromeda was taken by NASA's Galaxy Evolution Explorer in ultraviolet light.  Andromeda is a spiral galaxy like our Milky Way but larger in size. It lies 2.5 million light-years away in the Andromeda constellation.  http://photojournal.jpl.nasa.gov/catalog/PIA20970"
                   }
                ],
                links: [
                   {
                      href: "https://images-assets.nasa.gov/image/PIA20970/PIA20970~thumb.jpg",
                      rel: "preview",
                      render: "image"
                   }
                ]
             },
             {
                href: "https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e000677/collection.json",
                data: [
                   {
                      album: [
                         "Test"
                      ],
                      center: "GSFC",
                      title: "Hubble Looks in on a Galactic Nursery",
                      keywords: [
                         "Hubble Looks in on a Galactic Nursery",
                         "ngc1140"
                      ],
                      location: "Greenbelt, MD",
                      nasa_id: "GSFC_20171208_Archive_e000677",
                      date_created: "2017-12-08T00:00:00Z",
                      media_type: "image",
                      description: "This dramatic image shows the NASA/ESA Hubble Space Telescope’s view of dwarf galaxy known as NGC 1140, which lies 60 million light-years away in the constellation of Eridanus. As can be seen in this image NGC 1140 has an irregular form, much like the Large Magellanic Cloud — a small galaxy that orbits the Milky Way.  This small galaxy is undergoing what is known as a starburst. Despite being almost ten times smaller than the Milky Way it is creating stars at about the same rate, with the equivalent of one star the size of our sun being created per year. This is clearly visible in the image, which shows the galaxy illuminated by bright, blue-white, young stars.  Galaxies like NGC 1140 — small, starbursting and containing large amounts of primordial gas with far fewer elements heavier than hydrogen and helium than are present in our sun — are of particular interest to astronomers. Their composition makes them similar to the intensely star-forming galaxies in the early Universe. And these early Universe galaxies were the building blocks of present-day large galaxies like our galaxy, the Milky Way. But, as they are so far away these early Universe galaxies are harder to study so these closer starbursting galaxies are a good substitute for learning more about galaxy evolution.  The vigorous star formation will have a very destructive effect on this small dwarf galaxy in its future. When the larger stars in the galaxy die, and explode as supernovae, gas is blown into space and may easily escape the gravitational pull of the galaxy. The ejection of gas from the galaxy means it is throwing out its potential for future stars as this gas is one of the building blocks of star formation. NGC 1140’s starburst cannot last for long.  Image credit: ESA/Hubble &amp;amp; NASA "
                   }
                ],
                links: [
                   {
                      href: "https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e000677/GSFC_20171208_Archive_e000677~thumb.jpg",
                      rel: "preview",
                      render: "image"
                   }
                ]
             },
             {
                href: "https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e000259/collection.json",
                data: [
                   {
                      album: [
                         "Test"
                      ],
                      center: "GSFC",
                      title: "Hubble views a spectacular supernova with interstellar material over 160,000 light-years away",
                      keywords: [
                         "Hubble views a spectacular supernova with interstellar material over 160,000 light-years away",
                         "deml316a"
                      ],
                      location: "Greenbelt, MD",
                      nasa_id: "GSFC_20171208_Archive_e000259",
                      date_created: "2017-12-08T00:00:00Z",
                      media_type: "image",
                      description: "This NASA/ESA Hubble Space Telescope image captures the remnants of a long-dead star. These rippling wisps of ionized gas, named DEM L316A, are located some 160,000 light-years away within one of the Milky Way’s closest galactic neighbors — the Large Magellanic Cloud (LMC).  The explosion that formed DEM L316A was an example of an especially energetic and bright variety of supernova, known as a Type Ia. Such supernova events are thought to occur when a white dwarf star steals more material than it can handle from a nearby companion, and becomes unbalanced. The result is a spectacular release of energy in the form of a bright, violent explosion, which ejects the star’s outer layers into the surrounding space at immense speeds. As this expelled gas travels through the interstellar material, it heats up and ionizes it, producing the faint glow that Hubble’s Wide Field Camera 3 has captured here.  The LMC orbits the Milky Way as a satellite galaxy and is the fourth largest in our group of galaxies, the Local Group. DEM L316A is not the only supernova remnant in the LMC; Hubble came across another one in 2010 with SNR 0509, and in 2013 it snapped SNR 0519.  Image credit: ESA (European Space Agency)/Hubble &amp;amp; NASA, Y. Chu"
                   }
                ],
                links: [
                   {
                      href: "https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e000259/GSFC_20171208_Archive_e000259~thumb.jpg",
                      rel: "preview",
                      render: "image"
                   }
                ]
             },
             {
                href: "https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e000436/collection.json",
                data: [
                   {
                      album: [
                         "Test"
                      ],
                      center: "GSFC",
                      title: "Hubble Unveils a Tapestry of Dazzling Diamond-like Stars",
                      keywords: [
                         "Hubble Unveils a Tapestry of Dazzling Diamond-like Stars",
                         "space",
                         "nasa",
                         "hubble",
                         "nasagoddard"
                      ],
                      location: "Greenbelt, MD",
                      nasa_id: "GSFC_20171208_Archive_e000436",
                      date_created: "2017-12-08T00:00:00Z",
                      media_type: "image",
                      description: "Resembling an opulent diamond tapestry, this image from NASA’s Hubble Space Telescope shows a glittering star cluster that contains a collection of some of the brightest stars seen in our Milky Way galaxy. Called Trumpler 14, it is located 8,000 light-years away in the Carina Nebula, a huge star-formation region. Because the cluster is only 500,000 years old, it has one of the highest concentrations of massive, luminous stars in the entire Milky Way. The small, dark knot left of center is a nodule of gas laced with dust, and seen in silhouette.  Credit: NASA/ESA/J. Maíz Apellániz (Institute of Astrophysics of Andalusia, Spain)  &lt;b&gt;&lt;a href="http://www.nasa.gov/audience/formedia/features/MP_Photo_Guidelines.html" rel="nofollow"&gt;NASA image use policy.&lt;/a&gt;&lt;/b&gt;  &lt;b&gt;&lt;a href="http://www.nasa.gov/centers/goddard/home/index.html" rel="nofollow"&gt;NASA Goddard Space Flight Center&lt;/a&gt;&lt;/b&gt; enables NASA’s mission through four scientific endeavors: Earth Science, Heliophysics, Solar System Exploration, and Astrophysics. Goddard plays a leading role in NASA’s accomplishments by contributing compelling scientific knowledge to advance the Agency’s mission. &lt;b&gt;Follow us on &lt;a href="http://twitter.com/NASAGoddardPix" rel="nofollow"&gt;Twitter&lt;/a&gt;&lt;/b&gt; &lt;b&gt;Like us on &lt;a href="http://www.facebook.com/pages/Greenbelt-MD/NASA-Goddard/395013845897?ref=tsd" rel="nofollow"&gt;Facebook&lt;/a&gt;&lt;/b&gt; &lt;b&gt;Find us on &lt;a href="http://instagram.com/nasagoddard?vm=grid" rel="nofollow"&gt;Instagram&lt;/a&gt;&lt;/b&gt;  "
                   }
                ],
                links: [
                   {
                      href: "https://images-assets.nasa.gov/image/GSFC_20171208_Archive_e000436/GSFC_20171208_Archive_e000436~thumb.jpg",
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