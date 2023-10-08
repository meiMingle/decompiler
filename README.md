<p align="center">
    <a href="https://github.com/sotasan/decompiler/blob/master/src/test/java/com/sotasan/decompiler/Main.java"><img width="85%" alt="Screenshot" src="https://github.com/sotasan/decompiler/raw/master/src/test/resources/META-INF/screenshot.png"></a>
</p>

<p align="center">
    <a href="https://github.com/sotasan/decompiler/tags"><img alt="Version" src="https://img.shields.io/github/v/release/sotasan/decompiler?label=Version"></a>
    <a href="https://github.com/sotasan/decompiler/actions/workflows/build.yml"><img alt="Build" src="https://github.com/sotasan/decompiler/actions/workflows/build.yml/badge.svg"></a>
    <a href="https://github.com/sotasan/decompiler/blob/master/LICENSE"><img alt="License" src="https://img.shields.io/github/license/sotasan/decompiler?label=License"></a>
</p>

# <a href="https://github.com/sotasan/decompiler/blob/master/src/main/resources/logo/logo.svg"><img src="https://github.com/sotasan/decompiler/raw/master/src/main/resources/logo/logo.png" alt="Logo" width="30" height="auto"></a> Decompiler

A Java-Based GUI application that allows you to browse java archives using various different decompilers.

## Download

To download the application, you can go to the [Releases](https://github.com/sotasan/decompiler/releases) page to either directly download the .jar, or you can obtain the source and [build it yourself](https://github.com/sotasan/decompiler#Build).
The latest release can be found [here](https://github.com/sotasan/decompiler/releases/tag/v0.9.0).

## Usage

To run the program, simply execute the jar file.
Then, you can drag-and-drop any jar you want to decompile and analyze directly onto the program.
From here, you will be able to browse the archive's files using the tree browser on the left.

You can select a decompiler to use by locating the decompiler dropdown in the top right.

![DropdownImage](src/test/resources/META-INF/Decompiler%20Type%20Screenshot.png)

If you want to compare different compilers side to side or if you want to analyze multiple jars at once, you can start up a new instance of the application via the File dropdown.

You can zoom in and out of the screen by holding Ctrl then using the scroll wheel.

## Decompilers

The decompiler GUI supports the following decompilers:

- [CFR](https://www.benf.org/other/cfr/) - Another Java Decompiler
- [Procyon](https://github.com/mstrobel/procyon) - A suite of Java metaprogramming tools
- [Vineflower](https://vineflower.org) - Modern Java decompiler aiming to be as accurate as possible

## Languages

The decompiler GUI supports the following languages:

- [English](https://github.com/sotasan/decompiler/blob/master/src/main/resources/langs/language.properties)
- [German](https://github.com/sotasan/decompiler/blob/master/src/main/resources/langs/language_de.properties)
- [French](https://github.com/sotasan/decompiler/blob/master/src/main/resources/langs/language_fr.properties)
- [Japanese](https://github.com/sotasan/decompiler/blob/master/src/main/resources/langs/language_ja.properties)
- [Dutch](https://github.com/sotasan/decompiler/blob/master/src/main/resources/langs/language_nl.properties)
- [Russian](https://github.com/sotasan/decompiler/blob/master/src/main/resources/langs/language_ru.properties)
- [Chinese](https://github.com/sotasan/decompiler/blob/master/src/main/resources/langs/language_zh.properties)

The language is automatically determined by your locale.
To add more languages, you can add new localization files [here](https://github.com/sotasan/decompiler/blob/master/src/main/resources/langs/).

## Build

To build the application from source, you can navigate to a new directory and run the following script:

```bash
$ git clone https://github.com/sotasan/decompiler.git
$ cd decompiler
$ chmod +x gradlew
$ ./gradlew build
```

## Contributing

You can make issue requests [here](https://github.com/sotasan/decompiler/issues).

## License

[Apache License 2.0](https://github.com/sotasan/decompiler/blob/master/LICENSE)