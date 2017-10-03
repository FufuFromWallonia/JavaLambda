Images' conversion
------------------
First install ImageMagick (mileage may vary)

Using ImageMagick to convert images to useable backgrounds for the slides:

Make image less dark.
```
convert image.png -fill white -colorize 70% output.png
```

Make image transparent
```
convert image.png -alpha set -channel A -evaluate set 50% output.png
```