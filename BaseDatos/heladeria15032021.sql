PGDMP     (    /    
            y         	   heladeria    12.6    12.6 >    g           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            h           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            i           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            j           1262    16393 	   heladeria    DATABASE     �   CREATE DATABASE heladeria WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Ecuador.1252' LC_CTYPE = 'Spanish_Ecuador.1252';
    DROP DATABASE heladeria;
                postgres    false            �            1259    16403    sec_id_categoria    SEQUENCE     y   CREATE SEQUENCE public.sec_id_categoria
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.sec_id_categoria;
       public          postgres    false            �            1259    16405    categoria_helado    TABLE     �   CREATE TABLE public.categoria_helado (
    id_categoria character(20) DEFAULT nextval('public.sec_id_categoria'::regclass) NOT NULL,
    "	nombre_categoria" character(100),
    descripcion character(250)
);
 $   DROP TABLE public.categoria_helado;
       public         heap    postgres    false    204            �            1259    16409    sec_id_cliente    SEQUENCE     w   CREATE SEQUENCE public.sec_id_cliente
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.sec_id_cliente;
       public          postgres    false            �            1259    16411    cliente    TABLE     J  CREATE TABLE public.cliente (
    id_cliente character(30) DEFAULT nextval('public.sec_id_cliente'::regclass) NOT NULL,
    nombre_cliente character(30),
    apellido_cliente character(30),
    direccion_cliente character(30),
    email_cliente character(30),
    telefono_cliente character(30),
    tipo_cliente character(20)
);
    DROP TABLE public.cliente;
       public         heap    postgres    false    206            �            1259    16415    cliente_id_cliente    SEQUENCE     {   CREATE SEQUENCE public.cliente_id_cliente
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.cliente_id_cliente;
       public          postgres    false            �            1259    16417    sec_id_detalle_ingreso    SEQUENCE        CREATE SEQUENCE public.sec_id_detalle_ingreso
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.sec_id_detalle_ingreso;
       public          postgres    false            �            1259    16419    detalle_ingreso    TABLE       CREATE TABLE public.detalle_ingreso (
    id_detalle_ingreso character(20) DEFAULT nextval('public.sec_id_detalle_ingreso'::regclass) NOT NULL,
    id_ingreso character(20),
    id_articulo character(20),
    cantidad character(20),
    precio character(30)
);
 #   DROP TABLE public.detalle_ingreso;
       public         heap    postgres    false    209            �            1259    16423    detalle_venta    TABLE     �   CREATE TABLE public.detalle_venta (
    id_venta character varying,
    id_helado character varying,
    cantidad character(30),
    subtotal character(20),
    descuento character(20),
    id_detalle_venta bigint NOT NULL
);
 !   DROP TABLE public.detalle_venta;
       public         heap    postgres    false            �            1259    16429 "   detalle_venta_id_detalle_venta_seq    SEQUENCE     �   CREATE SEQUENCE public.detalle_venta_id_detalle_venta_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 9   DROP SEQUENCE public.detalle_venta_id_detalle_venta_seq;
       public          postgres    false    211            k           0    0 "   detalle_venta_id_detalle_venta_seq    SEQUENCE OWNED BY     i   ALTER SEQUENCE public.detalle_venta_id_detalle_venta_seq OWNED BY public.detalle_venta.id_detalle_venta;
          public          postgres    false    212            �            1259    24587    especificacion_helado    TABLE     �   CREATE TABLE public.especificacion_helado (
    id_especificacionhelado bigint NOT NULL,
    especificacion character(300),
    descripcion character(100),
    id_helado character(20)
);
 )   DROP TABLE public.especificacion_helado;
       public         heap    postgres    false            �            1259    24585 1   especificacion_helado_id_especificacionhelado_seq    SEQUENCE     �   CREATE SEQUENCE public.especificacion_helado_id_especificacionhelado_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 H   DROP SEQUENCE public.especificacion_helado_id_especificacionhelado_seq;
       public          postgres    false    218            l           0    0 1   especificacion_helado_id_especificacionhelado_seq    SEQUENCE OWNED BY     �   ALTER SEQUENCE public.especificacion_helado_id_especificacionhelado_seq OWNED BY public.especificacion_helado.id_especificacionhelado;
          public          postgres    false    217            �            1259    16394    sec_id_articulo    SEQUENCE     x   CREATE SEQUENCE public.sec_id_articulo
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.sec_id_articulo;
       public          postgres    false            �            1259    16396    helado    TABLE     ]  CREATE TABLE public.helado (
    id_helado character(15) DEFAULT nextval('public.sec_id_articulo'::regclass) NOT NULL,
    id_categoria character(20),
    codigo_articulo character(100),
    nombre_articulo character varying(200),
    precio_venta character(20),
    stock character(15),
    descripcion character(200),
    imagen character(250)
);
    DROP TABLE public.helado;
       public         heap    postgres    false    202            �            1259    16431    sec_id_ingreso    SEQUENCE     w   CREATE SEQUENCE public.sec_id_ingreso
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.sec_id_ingreso;
       public          postgres    false            �            1259    16433    ingreso    TABLE     �   CREATE TABLE public.ingreso (
    id_ingreso character(20) DEFAULT nextval('public.sec_id_ingreso'::regclass) NOT NULL,
    proveedor character(20),
    fecha character(20),
    total character(50),
    id_helado character(20)
);
    DROP TABLE public.ingreso;
       public         heap    postgres    false    213            �            1259    16437    sec_id_venta    SEQUENCE     u   CREATE SEQUENCE public.sec_id_venta
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.sec_id_venta;
       public          postgres    false            �            1259    24595    tipo_cliente    TABLE     a   CREATE TABLE public.tipo_cliente (
    id_tipocliente bigint NOT NULL,
    tipo character(50)
);
     DROP TABLE public.tipo_cliente;
       public         heap    postgres    false            �            1259    24593    tipo_cliente_id_tipocliente_seq    SEQUENCE     �   CREATE SEQUENCE public.tipo_cliente_id_tipocliente_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 6   DROP SEQUENCE public.tipo_cliente_id_tipocliente_seq;
       public          postgres    false    220            m           0    0    tipo_cliente_id_tipocliente_seq    SEQUENCE OWNED BY     c   ALTER SEQUENCE public.tipo_cliente_id_tipocliente_seq OWNED BY public.tipo_cliente.id_tipocliente;
          public          postgres    false    219            �            1259    16439    venta    TABLE     8  CREATE TABLE public.venta (
    id_venta character varying DEFAULT nextval('public.sec_id_venta'::regclass) NOT NULL,
    fecha_venta character varying,
    id_cliente character varying,
    forma_pago character varying,
    iva character varying,
    total character varying,
    descuento character varying
);
    DROP TABLE public.venta;
       public         heap    postgres    false    215            �
           2604    16446    detalle_venta id_detalle_venta    DEFAULT     �   ALTER TABLE ONLY public.detalle_venta ALTER COLUMN id_detalle_venta SET DEFAULT nextval('public.detalle_venta_id_detalle_venta_seq'::regclass);
 M   ALTER TABLE public.detalle_venta ALTER COLUMN id_detalle_venta DROP DEFAULT;
       public          postgres    false    212    211            �
           2604    24590 -   especificacion_helado id_especificacionhelado    DEFAULT     �   ALTER TABLE ONLY public.especificacion_helado ALTER COLUMN id_especificacionhelado SET DEFAULT nextval('public.especificacion_helado_id_especificacionhelado_seq'::regclass);
 \   ALTER TABLE public.especificacion_helado ALTER COLUMN id_especificacionhelado DROP DEFAULT;
       public          postgres    false    218    217    218            �
           2604    24598    tipo_cliente id_tipocliente    DEFAULT     �   ALTER TABLE ONLY public.tipo_cliente ALTER COLUMN id_tipocliente SET DEFAULT nextval('public.tipo_cliente_id_tipocliente_seq'::regclass);
 J   ALTER TABLE public.tipo_cliente ALTER COLUMN id_tipocliente DROP DEFAULT;
       public          postgres    false    219    220    220            U          0    16405    categoria_helado 
   TABLE DATA           Z   COPY public.categoria_helado (id_categoria, "	nombre_categoria", descripcion) FROM stdin;
    public          postgres    false    205   �L       W          0    16411    cliente 
   TABLE DATA           �   COPY public.cliente (id_cliente, nombre_cliente, apellido_cliente, direccion_cliente, email_cliente, telefono_cliente, tipo_cliente) FROM stdin;
    public          postgres    false    207   �L       Z          0    16419    detalle_ingreso 
   TABLE DATA           h   COPY public.detalle_ingreso (id_detalle_ingreso, id_ingreso, id_articulo, cantidad, precio) FROM stdin;
    public          postgres    false    210   SO       [          0    16423    detalle_venta 
   TABLE DATA           m   COPY public.detalle_venta (id_venta, id_helado, cantidad, subtotal, descuento, id_detalle_venta) FROM stdin;
    public          postgres    false    211   pO       b          0    24587    especificacion_helado 
   TABLE DATA           p   COPY public.especificacion_helado (id_especificacionhelado, especificacion, descripcion, id_helado) FROM stdin;
    public          postgres    false    218   jP       S          0    16396    helado 
   TABLE DATA           �   COPY public.helado (id_helado, id_categoria, codigo_articulo, nombre_articulo, precio_venta, stock, descripcion, imagen) FROM stdin;
    public          postgres    false    203   �P       ^          0    16433    ingreso 
   TABLE DATA           Q   COPY public.ingreso (id_ingreso, proveedor, fecha, total, id_helado) FROM stdin;
    public          postgres    false    214   �P       d          0    24595    tipo_cliente 
   TABLE DATA           <   COPY public.tipo_cliente (id_tipocliente, tipo) FROM stdin;
    public          postgres    false    220   �P       `          0    16439    venta 
   TABLE DATA           e   COPY public.venta (id_venta, fecha_venta, id_cliente, forma_pago, iva, total, descuento) FROM stdin;
    public          postgres    false    216   Q       n           0    0    cliente_id_cliente    SEQUENCE SET     A   SELECT pg_catalog.setval('public.cliente_id_cliente', 1, false);
          public          postgres    false    208            o           0    0 "   detalle_venta_id_detalle_venta_seq    SEQUENCE SET     Q   SELECT pg_catalog.setval('public.detalle_venta_id_detalle_venta_seq', 22, true);
          public          postgres    false    212            p           0    0 1   especificacion_helado_id_especificacionhelado_seq    SEQUENCE SET     `   SELECT pg_catalog.setval('public.especificacion_helado_id_especificacionhelado_seq', 1, false);
          public          postgres    false    217            q           0    0    sec_id_articulo    SEQUENCE SET     >   SELECT pg_catalog.setval('public.sec_id_articulo', 1, false);
          public          postgres    false    202            r           0    0    sec_id_categoria    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.sec_id_categoria', 1, false);
          public          postgres    false    204            s           0    0    sec_id_cliente    SEQUENCE SET     =   SELECT pg_catalog.setval('public.sec_id_cliente', 1, false);
          public          postgres    false    206            t           0    0    sec_id_detalle_ingreso    SEQUENCE SET     E   SELECT pg_catalog.setval('public.sec_id_detalle_ingreso', 1, false);
          public          postgres    false    209            u           0    0    sec_id_ingreso    SEQUENCE SET     =   SELECT pg_catalog.setval('public.sec_id_ingreso', 1, false);
          public          postgres    false    213            v           0    0    sec_id_venta    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.sec_id_venta', 1, false);
          public          postgres    false    215            w           0    0    tipo_cliente_id_tipocliente_seq    SEQUENCE SET     N   SELECT pg_catalog.setval('public.tipo_cliente_id_tipocliente_seq', 1, false);
          public          postgres    false    219            �
           2606    16448    cliente Cliente_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT "Cliente_pkey" PRIMARY KEY (id_cliente);
 @   ALTER TABLE ONLY public.cliente DROP CONSTRAINT "Cliente_pkey";
       public            postgres    false    207            �
           2606    16450    helado articulo_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.helado
    ADD CONSTRAINT articulo_pkey PRIMARY KEY (id_helado);
 >   ALTER TABLE ONLY public.helado DROP CONSTRAINT articulo_pkey;
       public            postgres    false    203            �
           2606    16452    categoria_helado categoria_pkey 
   CONSTRAINT     g   ALTER TABLE ONLY public.categoria_helado
    ADD CONSTRAINT categoria_pkey PRIMARY KEY (id_categoria);
 I   ALTER TABLE ONLY public.categoria_helado DROP CONSTRAINT categoria_pkey;
       public            postgres    false    205            �
           2606    16454 $   detalle_ingreso detalle_ingreso_pkey 
   CONSTRAINT     r   ALTER TABLE ONLY public.detalle_ingreso
    ADD CONSTRAINT detalle_ingreso_pkey PRIMARY KEY (id_detalle_ingreso);
 N   ALTER TABLE ONLY public.detalle_ingreso DROP CONSTRAINT detalle_ingreso_pkey;
       public            postgres    false    210            �
           2606    16456     detalle_venta detalle_venta_pkey 
   CONSTRAINT     l   ALTER TABLE ONLY public.detalle_venta
    ADD CONSTRAINT detalle_venta_pkey PRIMARY KEY (id_detalle_venta);
 J   ALTER TABLE ONLY public.detalle_venta DROP CONSTRAINT detalle_venta_pkey;
       public            postgres    false    211            �
           2606    24592 0   especificacion_helado especificacion_helado_pkey 
   CONSTRAINT     �   ALTER TABLE ONLY public.especificacion_helado
    ADD CONSTRAINT especificacion_helado_pkey PRIMARY KEY (id_especificacionhelado);
 Z   ALTER TABLE ONLY public.especificacion_helado DROP CONSTRAINT especificacion_helado_pkey;
       public            postgres    false    218            �
           2606    16458    venta factura_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.venta
    ADD CONSTRAINT factura_pkey PRIMARY KEY (id_venta);
 <   ALTER TABLE ONLY public.venta DROP CONSTRAINT factura_pkey;
       public            postgres    false    216            �
           2606    16460    ingreso ingreso_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.ingreso
    ADD CONSTRAINT ingreso_pkey PRIMARY KEY (id_ingreso);
 >   ALTER TABLE ONLY public.ingreso DROP CONSTRAINT ingreso_pkey;
       public            postgres    false    214            �
           2606    24600    tipo_cliente tipo_cliente_pkey 
   CONSTRAINT     h   ALTER TABLE ONLY public.tipo_cliente
    ADD CONSTRAINT tipo_cliente_pkey PRIMARY KEY (id_tipocliente);
 H   ALTER TABLE ONLY public.tipo_cliente DROP CONSTRAINT tipo_cliente_pkey;
       public            postgres    false    220            �
           2606    16461 .   detalle_venta detalle_factura_id_articulo_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.detalle_venta
    ADD CONSTRAINT detalle_factura_id_articulo_fkey FOREIGN KEY (id_helado) REFERENCES public.helado(id_helado) NOT VALID;
 X   ALTER TABLE ONLY public.detalle_venta DROP CONSTRAINT detalle_factura_id_articulo_fkey;
       public          postgres    false    203    211    2750            �
           2606    16466 -   detalle_venta detalle_factura_id_factura_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.detalle_venta
    ADD CONSTRAINT detalle_factura_id_factura_fkey FOREIGN KEY (id_venta) REFERENCES public.venta(id_venta) NOT VALID;
 W   ALTER TABLE ONLY public.detalle_venta DROP CONSTRAINT detalle_factura_id_factura_fkey;
       public          postgres    false    216    2762    211            �
           2606    16471 /   detalle_ingreso detalle_ingreso_id_ingreso_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.detalle_ingreso
    ADD CONSTRAINT detalle_ingreso_id_ingreso_fkey FOREIGN KEY (id_ingreso) REFERENCES public.ingreso(id_ingreso) NOT VALID;
 Y   ALTER TABLE ONLY public.detalle_ingreso DROP CONSTRAINT detalle_ingreso_id_ingreso_fkey;
       public          postgres    false    2760    210    214            �
           2606    16476     helado factura_id_categoria_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.helado
    ADD CONSTRAINT factura_id_categoria_fkey FOREIGN KEY (id_categoria) REFERENCES public.categoria_helado(id_categoria) NOT VALID;
 J   ALTER TABLE ONLY public.helado DROP CONSTRAINT factura_id_categoria_fkey;
       public          postgres    false    205    203    2752            �
           2606    16481    venta factura_id_cliente_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.venta
    ADD CONSTRAINT factura_id_cliente_fkey FOREIGN KEY (id_cliente) REFERENCES public.cliente(id_cliente) NOT VALID;
 G   ALTER TABLE ONLY public.venta DROP CONSTRAINT factura_id_cliente_fkey;
       public          postgres    false    207    2754    216            U      x������ � �      W   �  x��VKn�0\?��'0����i#�8�
J�%�hP���6=@E�������]T�nHΐ�q�Q1��V��py̩�N&�r[��G��燉�y$}G�3�ʪ"���l	�gm֚�i�qS�gYF�9u�8���l�nŧiJ�hqf�(�����$M(Ż.�6EG��@Ym��S�C�!k���$�p'�ռ��8e��v���n���5�M����^I9���
v�4Jb�%Ļ�yy����窯[���2�-�Ň!Q�4u���������;q�:�7�XIUWn�ۼ2�չ����qx�]��&��0J�-��6�3�+��l	P	��2�!�#�7B���{V�y���1�'�����Df4�ۘ-��ϖ��|�hz-ޒ#�ˢ� �gϳ]�x<���(>j�
K'�~Tݛ�{���,ܻW\�MgV���<�]��x�4���u�O?	\�wV6/e�K���9�z�_���<�|F�_���z�X�_�(?I�^���L�~�ᖫ��>|}]��ru�]`!�!9�p����PXbr���؂+Uˏyv���bʖC)�C흳���х�1��1׹X=���!��������AQ�Os[`�Qx~0^@��{���m7��K���w��r;38��� �0E	����d�j�;�      Z      x������ � �      [   �   x�����  гT�d�O[A��cI�$Hg�Q�*H�?���4�����(v(���>S��Tz�ʀ!������.����PRh:���:�`
��]d�P��P�˓S��l(6��297��6kԳ��i��¿EPw�J���*��X�8VK��b��9���]�F��V�f�EM��?X��l �t�m5�6�ٱ:t�F���i!�b�g~��85A8�y�S�Dp ���ܑ      b      x������ � �      S   B   x�3V@�1~��ːEfff��c�1�L�QdA�"Kb�N�(2$F�Q&���]Q� ��Z�      ^      x������ � �      d      x������ � �      `   �   x���1n1�΂X�|���H�J��D9<�L�Y�A��ld�a���[XEݟ�ϟ��o*�$@*)�8^¥Fm��<^��LK�ȵ�y��
#���E��]ot���;ƨ+��c$z��]��d�0�+��z�ns�`?���6������E��t���F�}���Pf��U�     