JUnRAR
======

#### Plain Java UnRAR Utility. Original project by [Edmund Wagner](https://github.com/edmund-wagner/junrar) (formerly on [SourceForge](https://sourceforge.net)).

* **Fixed critical bug in the extraction algorithm that caused wrong bytes in the extracted files in some cases** (see [this issue](https://github.com/edmund-wagner/junrar/issues/36), thanks to [Roy Damman](https://github.com/RDamman)).
* Fixed major bug that prevented the extraction of files larger than 2.147.483.647 bytes (see [this pull request](https://github.com/junrar/junrar/pull/3), thanks to [acc15](https://github.com/acc15)).
* Fixed minor bug that caused inaccurate file times (see [this pull request](https://github.com/edmund-wagner/junrar/pull/20), thanks to [Luke Quinane](https://github.com/tmyroadctfig)).
* Multi-volume archives are supported in both old and new flavours (`.rXX` & `.partX.rar`).
* **Encrypted and password protected archives are not yet supported.**
* **RAR 5 format is not supported**.

#### Fork used in http://bonzaireader.com
* Support for streaming RAR from any InputStream
* ** Use Archive.getAsyncFileHeaders to asynchronously scan the FileHeader
* ** Use Archive.extractFile to extract from a scanned FileHeader
* Removes vfs support
* http://stackoverflow.com/questions/24113840/how-to-decompress-a-rar-file-in-android-application-with-out-of-memory-exception
