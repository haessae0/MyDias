======================================================
Oracle Free Use Terms and Conditions (FUTC) License 
======================================================
https://www.oracle.com/downloads/licenses/oracle-free-license.html
===================================================================

ojdbc8-full.tar.gz - JDBC Thin Driver and Companion JARS
========================================================
This TAR archive (ojdbc8-full.tar.gz) contains the 19.17 release of the Oracle JDBC Thin driver(ojdbc8.jar), the Universal Connection Pool (ucp.jar) and other companion JARs grouped by category. 

(1) ojdbc8.jar (4,474,708 bytes) - 
(SHA1 Checksum: 984dcc8d719fb0de1176760a868c1b99752cedcc)
Oracle JDBC Driver compatible with JDK8, JDK9, and JDK11;
(2) ucp.jar (1,691,607 bytes) - (SHA1 Checksum: 53f0f04d79bbb4a751daa36325739d2e584ae23e)
Universal Connection Pool classes for use with JDK8, JDK9, and JDK11 -- for performance, scalability, high availability, sharded and multitenant databases.
(3) ojdbc.policy (11,762 bytes) - Sample security policy file for Oracle Database JDBC drivers

======================
Security Related JARs
======================
Java applications require some additional jars to use Oracle Wallets. 
You need to use all the three jars while using Oracle Wallets. 

(4) oraclepki.jar (306,753 bytes ) - (SHA1 Checksum: 48c00fbead14f3439fcdfbfad4df04e0edfbc517)
Additional jar required to access Oracle Wallets from Java
(5) osdt_cert.jar (210,333 bytes) - (SHA1 Checksum: 5998494d642b7e47da8b62aa1f470720757c1e0f)
Additional jar required to access Oracle Wallets from Java
(6) osdt_core.jar (312,278 bytes) - (SHA1 Checksum: 5f63e99e6b4f55d3a8c7ac1f09fae5ac9d92f6c8)
Additional jar required to access Oracle Wallets from Java

=============================
JARs for NLS and XDK support 
=============================
(7) orai18n.jar (1,663,954 bytes) - (SHA1 Checksum: 3744bc9f42a2d809f926d6d0d7ec44718d66b53f) 
Classes for NLS support
(8) xdb.jar (129,127 bytes) - (SHA1 Checksum: 565a695acc7a22fb6a9d09cd2705bbba7e0e1e44)
Classes to support standard JDBC 4.x java.sql.SQLXML interface 
(9) xmlparserv2.jar (1,935,496 bytes) - (SHA1 Checksum: 6c03445908ba5435796bcf032fcc5d21278381cd)
Classes to support standard JDBC 4.x java.sql.SQLXML interface 
(10) xmlparserv2_sans_jaxp_services.jar (1,932,963 bytes) - (SHA1 Checksum: b295a6c3f163f0b57a608f17b2b74d814f53853d) 
Classes to support standard JDBC 4.x java.sql.SQLXML interface

====================================================
JARs for Real Application Clusters(RAC), ADG, or DG 
====================================================
(11) ons.jar (156,239 bytes ) - (SHA1 Checksum: 0f8bfc5514cb9eb4ea84559cd21b74511470ecd1)
for use by the pure Java client-side Oracle Notification Services (ONS) daemon
(12) simplefan.jar (32,168 bytes) - (SHA1 Checksum: 069c9ecce3fb81ad1b11a64d58988239ab56002a)
Java APIs for subscribing to RAC events via ONS; simplefan policy and javadoc

==================================================================================
NOTE: The diagnosability JARs **SHOULD NOT** be used in the production environment. 
These JARs (ojdbc8_g.jar,ojdbc8dms.jar, ojdbc8dms_g.jar) are meant to be used in the 
development, testing, or pre-production environment to diagnose any JDBC related issues. 

=====================================
OJDBC - Diagnosability Related JARs
===================================== 

(13) ojdbc8_g.jar (7,514,186 bytes) - (SHA1 Checksum: 6354d63c215fdeefccbe1aec0f318eaf363607a1)
Same as ojdbc8.jar except compiled with "javac -g" and contains tracing code.

(14) ojdbc8dms.jar (6,244,753 bytes) - (SHA1 Checksum: e625152733b69da1c96aa02895e0af556d4065cb)
Same as ojdbc8.jar, except that it contains instrumentation to support DMS and limited java.util.logging calls.

(15) ojdbc8dms_g.jar (7,543,948 bytes) - (SHA1 Checksum: c22c03be38684f34b6f4044c38defc2a7478ab46)
Same as ojdbc8_g.jar except that it contains instrumentation to support DMS.

(16) dms.jar (2,194,305 bytes) - (SHA1 Checksum: 07219d0fec3645d70a5824a803503399b74c5331)
dms.jar required for DMS-enabled JAR files.

==================================================================
Oracle JDBC and UCP - Javadoc and README
==================================================================

(17) JDBC-Javadoc-19c.jar (1,794,441 bytes) - JDBC API Reference 19c

(18) ucp-Javadoc-19c.jar (370,618 bytes) - UCP Java API Reference 19c

(19) simplefan-Javadoc-19c.jar (88,476 bytes) - Simplefan API Reference 19c 

(20) xdb-Javadoc-19c.jar (2,861,664 bytes) - XDB API Reference 19c 

(21) xmlparserv2-Javadoc-19c.jar (2,861,664 bytes) - xmlparserv2 API Reference 19c 

(22) Jdbc-Readme.txt: It contains general information about the JDBC driver and bugs that have been fixed in the 19.17 release. 

(23) UCP-Readme.txt: It contains general information about UCP and bugs that are fixed in the 19.17 release. 

(24) Bugs-fixed-in-1917.txt: It contains the list of bugs fixed in the 19.17 release. 

=================
USAGE GUIDELINES
=================
Refer to the JDBC Developers Guide (https://docs.oracle.com/en/database/oracle/oracle-database/19/jjdbc/index.html) and Universal Connection Pool Developers Guide (https://docs.oracle.com/en/database/oracle/oracle-database/19/jjucp/index.html) for more details. 