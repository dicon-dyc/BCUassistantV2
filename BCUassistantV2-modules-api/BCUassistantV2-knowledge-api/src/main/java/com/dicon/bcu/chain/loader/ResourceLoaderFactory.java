package com.dicon.bcu.chain.loader;

import com.dicon.bcu.chain.split.CharacterTextSplitter;
import com.dicon.bcu.chain.split.CodeTextSplitter;
import com.dicon.bcu.chain.split.MarkdownTextSplitter;
import com.dicon.bcu.constant.FileType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @Author: dyc
 * @Create: 2025/12/3 13:43
 */
@AllArgsConstructor
@Component
public class ResourceLoaderFactory {
    private final CharacterTextSplitter characterTextSplitter;
    private final CodeTextSplitter codeTextSplitter;
    private final MarkdownTextSplitter markdownTextSplitter;


    public ResourceLoader getLoaderByFileType(String fileType){
        if (FileType.isTextFile(fileType)){
            return new TextFileLoader(characterTextSplitter);
        } else if (FileType.isWord(fileType)) {
            return new WordLoader(characterTextSplitter);
        } else if (FileType.isPdf(fileType)) {
            return new PdfFileLoader(characterTextSplitter);
        } else if (FileType.isMdFile(fileType)) {
            return new MarkDownFileLoader(markdownTextSplitter);
        }else if (FileType.isCodeFile(fileType)) {
            return new CodeFileLoader(codeTextSplitter);
        }else {
            return new TextFileLoader(characterTextSplitter);
        }
    }
}

