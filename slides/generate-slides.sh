#!/bin/bash
ASCIIDOCTORJ_VERSION="1.5.6"
ASCIIDOCTORJ_FULL_NAME="asciidoctorj-${ASCIIDOCTORJ_VERSION}"
[[ -f ${ASCIIDOCTORJ_FULL_NAME}-bin.zip ]] || curl -L -XGET https://dl.bintray.com/asciidoctor/maven/org/asciidoctor/asciidoctorj/${ASCIIDOCTORJ_VERSION}/${ASCIIDOCTORJ_FULL_NAME}-bin.zip -o ${ASCIIDOCTORJ_FULL_NAME}-bin.zip
[[ -d ${ASCIIDOCTORJ_FULL_NAME} ]] || unzip ${ASCIIDOCTORJ_FULL_NAME}-bin.zip

for asciidocfile in `find . -type f -name "*.asciidoc"`;do
  ${ASCIIDOCTORJ_FULL_NAME}/bin/asciidoctorj -T $PWD/asciidoctor-reveal.js/templates/slim/ -a data-uri -a linkcss! $asciidocfile
done
