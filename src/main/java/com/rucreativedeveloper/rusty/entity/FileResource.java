package com.rucreativedeveloper.rusty.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class FileResource {

    @Column(name = "filename",columnDefinition = "LONGBLOB")
    private Blob fileName;
    @Column(name = "hash",columnDefinition = "LONGBLOB")
    private Blob hash;
    @Column(name = "directory",columnDefinition = "LONGBLOB")
    private Blob directory;
    @Column(name = "resourceurl",columnDefinition = "LONGBLOB")
    private Blob resourceUrl;

}
